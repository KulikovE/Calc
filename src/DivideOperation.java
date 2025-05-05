class DivideOperation implements Operation {
    @Override
    public long execute(String a, String b, int radix) {
        long num1 = NumberConverter.toDecimal(a, radix);
        long num2 = NumberConverter.toDecimal(b, radix);
        if (num2 == 0) throw new ArithmeticException("Деление на ноль!");
        return num1 / num2;
    }
}