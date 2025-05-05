class NumberConverter {
    public static long toDecimal(String number, int radix) {
        return Long.parseLong(number, radix);
    }

    public static String fromDecimal(long number, int radix) {
        return Long.toString(number, radix).toUpperCase();
    }

    public static String formatInAllBases(long decimal) {
        return String.format("Двоичная: %s | Восьмеричная: %s | Десятичная: %d | Шестнадцатеричная: %s",
                Long.toBinaryString(decimal),
                Long.toOctalString(decimal),
                decimal,
                Long.toHexString(decimal).toUpperCase());
    }
}