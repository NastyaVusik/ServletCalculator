package SOLID_2;

public class SumOperation implements Operation{
    private double num1;
    private double num2;
    private double result;

    @Override
    public Operation process() {
        result = num1 + num2;
        return this;
    }

    @Override
    public double getResult() {
        return result;
    }
}
