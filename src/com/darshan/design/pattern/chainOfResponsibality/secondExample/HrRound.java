package com.darshan.design.pattern.chainOfResponsibality.secondExample;

public class HrRound implements InterviewChain {
    private InterviewChain interviewChain;

    @Override
    public void setNext(InterviewChain interviewChain) {
        this.interviewChain = interviewChain;
    }

    @Override
    public void interviewCandidate(final Candidate candidate) {
        //we can have logic to reject the candidates as well!
        System.out.println("Hr is happening for the Candidate " + candidate.getName());
        System.out.println("Candidate is Good, We can offer him..!");
    }
}
