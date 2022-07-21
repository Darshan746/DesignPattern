package com.darshan.design.pattern.chainOfResponsibality.firstExample;

public enum OperationType {

    ADD("add"),
    SUBTRACT("subtract"),
    MULTIPLE("multiple");

    public String getOperationType() {
        return operationType;
    }

    private final String operationType;

    OperationType(final String operationType) {
        this.operationType = operationType;
    }
}
