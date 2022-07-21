package com.darshan.design.pattern.chainOfResponsibality.secondExample;

public interface InterviewChain {

    void setNext(final InterviewChain interviewChain);

    void interviewCandidate(final Candidate candidate);
}
