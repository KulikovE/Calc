class NumberConverter {
    public static long toDecimal(String number, int radix) {
        return Long.parseLong(number, radix);
    }

    public static String fromDecimal(long number, int radix) {
        return Long.toString(number, radix).toUpperCase();
    }
}
