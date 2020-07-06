package com.darshan.design.pattern.statedesign;
public class TVContext implements State, Cloneable {

	private State tvState;

	public void setState(State state) {
		this.tvState=state;
	}

	public State getState() {
		return this.tvState;
	}

	@Override protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public void doAction() {
		this.tvState.doAction();
	}

}