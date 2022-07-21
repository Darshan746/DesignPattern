package com.darshan.design.pattern.chainOfResponsibality.secondExample;

public class InterviewClient {
    public static void main(String[] args) {
        final Candidate candidate = new Candidate("Darshan", "30", 0.0);
        final L1Interview l1Interview = new L1Interview();
        final L2Interview l2Interview = new L2Interview();
        final Managerial managerial = new Managerial();
        final HrRound hrRound = new HrRound();

        l1Interview.setNext(l2Interview);
        l2Interview.setNext(managerial);
        managerial.setNext(hrRound);

        l1Interview.interviewCandidate(candidate);
    }
}
