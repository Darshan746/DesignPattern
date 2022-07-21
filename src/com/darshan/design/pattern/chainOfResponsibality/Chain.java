package com.darshan.design.pattern.chainOfResponsibality;

public interface Chain {

    void setNext(Chain chain);

    void process(Numbers numbers);
}
