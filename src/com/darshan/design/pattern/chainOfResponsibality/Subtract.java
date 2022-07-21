package com.darshan.design.pattern.chainOfResponsibality;

public class Subtract implements Chain {

    private Chain chain;

    @Override
    public void setNext(final Chain chain) {
        this.chain = chain;
    }

    @Override
    public void process(final Numbers numbers) {
        System.out.println("inside Subtract Process...");
        if (numbers.getOperationType().equals(OperationType.SUBTRACT.getOperationType())) {
            System.out.print(numbers.getNum1() + " " + "-" + " " + numbers.getNum2() + "= ");
            System.out.print(numbers.getNum1() - numbers.getNum2());
            return;
        } else {
            chain.process(numbers);
        }
    }

}
