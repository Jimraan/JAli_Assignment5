package com.Spring2020.AS5.Q6;

/* In Action.java, add an interface called CanClimb, CanFly, CanSwim following
* the form of the other interfaces.
*/

interface CanFight {
	void fight();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {System.out.println(" fight an Action Char");}
}

class Superman extends ActionCharacter implements CanFight,  CanFly{
	String name = "Superman";
	public void fight() {System.out.println("fight bad guys");}
	public void fly() {System.out.println("fly faster than Raptor F22");}	
}

public class Action {
	public static void t(CanFight x) { x.fight(); }
	public static void v(CanFly x) { x.fly(); }
	
	public static void w(ActionCharacter x) { x.fight(); }
	public static void main(String[] args) {
		Superman h = new Superman();
		System.out.println("I am " + h.name + " I can do the following:" );
		t(h); // Treat it as a CanFight
		v(h); // Treat it as a CanFly
	
	}
}