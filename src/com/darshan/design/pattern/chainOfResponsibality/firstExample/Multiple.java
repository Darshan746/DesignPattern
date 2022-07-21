package com.darshan.design.pattern.chainOfResponsibality.firstExample;

public class Multiple implements Chain {

    private Chain chain;

    @Override
    public void setNext(final Chain chain) {
        this.chain = chain;
    }

    @Override
    public void process(final Numbers numbers) {
        System.out.println("inside Multiple Process...");
        if (numbers.getOperationType().equals(OperationType.MULTIPLE.getOperationType())) {
            System.out.print(numbers.getNum1() + " " + "*" + " " + numbers.getNum2() + "=");
            System.out.print(numbers.getNum1() * numbers.getNum2());
        } else {
            System.out.println("As of now we are supporting Add, Subtract, and Multiple");
        }
    }
}
