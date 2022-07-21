package com.darshan.design.pattern.chainOfResponsibality.secondExample;

public class L2Interview implements InterviewChain {
    private InterviewChain interviewChain;

    @Override
    public void setNext(InterviewChain interviewChain) {
        this.interviewChain = interviewChain;
    }

    @Override
    public void interviewCandidate(final Candidate candidate) {
        System.out.println("L2 is happening for the Candidate " + candidate.getName());
        if (candidate.getPreviousInterviewRoundScore() >= 4) {
            candidate.setFirstRound(false);
            candidate.setPreviousInterviewRoundScore(4.0);
        }
        interviewChain.interviewCandidate(candidate);
    }
}
