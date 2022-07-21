package com.darshan.design.pattern.chainOfResponsibality;

public class Add implements Chain {

    private Chain chain;

    @Override
    public void setNext(final Chain chain) {
        this.chain = chain;
    }

    @Override
    public void process(final Numbers numbers) {
        System.out.println("inside Add Process...");

        if (numbers.getOperationType().equals(OperationType.ADD.getOperationType())) {
            System.out.print(numbers.getNum1() + " " + "+" + " " + numbers.getNum2() + " = ");
            System.out.print(numbers.getNum1() + numbers.getNum2());
            return;
        } else {
            chain.process(numbers);
        }
    }
}
