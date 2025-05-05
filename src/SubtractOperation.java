class SubtractOperation implements Operation {
    @Override
    public String execute(String a, String b, int radix) {
        long num1 = NumberConverter.toDecimal(a, radix);
        long num2 = NumberConverter.toDecimal(b, radix);
        return NumberConverter.fromDecimal(num1 - num2, radix);
    }
}