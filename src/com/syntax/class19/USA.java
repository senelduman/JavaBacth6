package com.syntax.class19;

public class USA {
	String state, stateCapital;

	public USA(String state,String stateCapital) {
		this.state=state;
		this.stateCapital=stateCapital;
	}
	public void displaystate() {
		System.out.println(state);
	}
	public void displaystateCapital() {
		System.out.println(stateCapital);
	}
	//can I call a method inside another method ?-->YES
	public static void main(String[] args) {

		USA state1 = new USA("Taxas","Austin");
		state1.displaystate();
		state1.displaystateCapital();

	}
	
}
