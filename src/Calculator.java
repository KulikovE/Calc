class Calculator {
    private int currentRadix;

    public Calculator(int radix) {
        this.currentRadix = radix;
    }

    public String calculate(Operation operation, String a, String b) {
        return operation.execute(a, b, currentRadix);
    }

    public void setRadix(int radix) {
        this.currentRadix = radix;
    }
}