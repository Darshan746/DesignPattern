package com.darshan.design.pattern.chainOfResponsibality.secondExample;

public class Candidate {

    private String name;
    private String age;

    public boolean isFirstRound() {
        return isFirstRound;
    }

    public void setFirstRound(boolean firstRound) {
        isFirstRound = firstRound;
    }

    private boolean isFirstRound = true;

    public Candidate() {
    }

    public Candidate(String name, String age, Double previousInterviewRoundScore) {
        this.name = name;
        this.age = age;
        this.previousInterviewRoundScore = previousInterviewRoundScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getPreviousInterviewRoundScore() {
        return previousInterviewRoundScore;
    }

    public void setPreviousInterviewRoundScore(Double previousInterviewRoundScore) {
        this.previousInterviewRoundScore = previousInterviewRoundScore;
    }

    private Double previousInterviewRoundScore;
}
