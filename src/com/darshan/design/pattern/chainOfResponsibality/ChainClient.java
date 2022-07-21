package com.darshan.design.pattern.chainOfResponsibality;

public class ChainClient {

    public static void main(String[] args) {
        final Chain addChain = new Add();
        final Chain subtractChain = new Subtract();
        final Chain multiplyChain = new Multiple();

        addChain.setNext(subtractChain);
        subtractChain.setNext(multiplyChain);
        multiplyChain.setNext(addChain);

        final Numbers numbers = new Numbers(1, 2, "subtract");
        addChain.process(numbers);
    }
}
