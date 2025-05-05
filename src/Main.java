import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите систему счисления (2, 8, 10, 16):");
        int radix = scanner.nextInt();
        scanner.nextLine();

        Calculator calculator = new Calculator(radix);

        while (true) {
            System.out.println("\nТекущая система счисления: " + radix);
            System.out.println("1. Сложение (+)\n2. Вычитание (-)\n3. Умножение (*)\n4. Деление (/)\n5. Сменить СС\n0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) break;

            if (choice == 5) {
                System.out.println("Новая система счисления (2, 8, 10, 16):");
                radix = scanner.nextInt();
                scanner.nextLine();
                calculator.setRadix(radix);
                continue;
            }
            //Вводим числа
            System.out.println("Введите первое число:");
            String a = scanner.nextLine().toUpperCase();
            System.out.println("Введите второе число:");
            String b = scanner.nextLine().toUpperCase();
            try {
                Operation operation = switch (choice) {
                    case 1 -> new AddOperation();
                    case 2 -> new SubtractOperation();
                    case 3 -> new MultiplyOperation();
                    case 4 -> new DivideOperation();
                    default -> throw new IllegalArgumentException("Неверная операция");
                };
                System.out.println("Результат: " + calculator.calculate(operation, a, b));
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        scanner.close();
    }
}