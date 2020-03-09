package com.Spring2020.AS5.Q6.Student;

/* In Action.java, add an interface called CanClimb, CanFly, CanSwim following
* the form of the other interfaces.
*/

interface CanClimb {//added
	void climb();
}
interface CanSwim {//added
	void swimFast();
	void treadH2O();
}
interface CanFight {
	void fight();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {System.out.println("We all fight as an ActionChar");}
}

class Superman extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {
	String name = "Superman";
	public void fight() {System.out.println("fight bad guys");}
	public void fly() {System.out.println("fly faster than Raptor F22");}
	public void swimFast() {System.out.println("Swim faster than Michael Phelps");}
	public void treadH2O() {System.out.println("Tread water forever");}
	public void climb() {System.out.println("climb slipper cliffs");}
}

class MrA extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {
	String name = "Mr A";
	public void fight() {System.out.println("chastise the bad guys");}
	public void fly() {System.out.println("yeet with the fleet");}
	public void swimFast() {System.out.println("split the kelps like Michael Phelps");}
	public void treadH2O() {System.out.println("Tread water like Neptune's daughter");}
	public void climb() {System.out.println("yiff that cliff");}
}

public class Action {
	public static void t(CanFight x) { x.fight(); }
	public static void v(CanFly x) { x.fly(); }
	public static void s(CanSwim x) { x.swimFast(); x.treadH2O(); }
	public static void c(CanClimb x) { x.climb(); }
	
	public static void w(ActionCharacter x) { x.fight(); }
	public static void main(String[] args) {
		Superman h = new Superman();
		MrA a = new MrA();
		ActionCharacter c = new ActionCharacter();
		
		System.out.println("I am " + h.name + " I can do the following:" );
		t(h); // Treat it as a CanFight
		s(h); // Treat is as a CanSwim
		v(h); // Treat it as a CanFly
		c(h); // Treat it as a CanClimb
		w(c); // Treat it as an ActionCharacter
		
		System.out.println("--------------");
		
		t(a); // Treat it as a CanFight
		s(a); // Treat is as a CanSwim
		v(a); // Treat it as a CanFly
		c(a); // Treat it as a CanClimb
		w(c); // Treat it as an ActionCharacter
		
		/*The fight() method in the interface CanFight overrides the
		 *  fight() method in the ActionCharacter class. To access 
		 *  ActionCharacter’s method, you must use an ActionCharacter 
		 *  object, as it does not implement the CanFight interface. 
		 *  Superman cannot use ActionCharacter’s fight method because 
		 *  it implements the CanFight interface.*/
	}
}