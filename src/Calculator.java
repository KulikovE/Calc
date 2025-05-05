class Calculator {
    private int currentRadix;

    public Calculator(int radix) {
        this.currentRadix = radix;
    }

    public String calculate(Operation operation, String a, String b) {
        long decimalResult = operation.execute(a, b, currentRadix);
        return NumberConverter.fromDecimal(decimalResult, currentRadix);
    }

    public void setRadix(int radix) {
        this.currentRadix = radix;
    }
}