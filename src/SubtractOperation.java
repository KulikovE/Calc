class SubtractOperation implements Operation {
    @Override
    public long execute(String a, String b, int radix) {
        long num1 = NumberConverter.toDecimal(a, radix);
        long num2 = NumberConverter.toDecimal(b, radix);
        return num1 - num2;
    }
}
