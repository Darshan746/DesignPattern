package com.darshan.design.pattern.chainOfResponsibality.firstExample;

public interface Chain {

    void setNext(Chain chain);

    void process(Numbers numbers);
}
