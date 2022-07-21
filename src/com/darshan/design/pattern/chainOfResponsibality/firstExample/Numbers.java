package com.darshan.design.pattern.chainOfResponsibality.firstExample;

public class Numbers {
    private int num1;
    private int num2;
    private String operationType;

    public Numbers(final int num1, final int num2, final String operationType) {
        this.num1 = num1;
        this.num2 = num2;
        this.operationType = operationType;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperationType() {
        return operationType;
    }
}
