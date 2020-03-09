package com.Spring2020.AS5.Q3.Student;



abstract class Nogo1 {
	Nogo1() { System.out.println("Nogo1()"); }
}

abstract class Nogo2 {
//  step 4
	abstract void nMethod();
}


// step 2 create a subclass Go1...
class Go1 extends Nogo1 {
	public Go1() {
		System.out.println(" in Go1() constructor");
	}
}



// step 5 create a subclass Go9...
class Go9 extends Nogo2 {
	public Go9() {
		System.out.println(" in Go9() constructor");
	}
	@Override
	void nMethod() {
		System.out.println("get nMethod() out of abstraction");
	}
}


public class NoGo {
	public static void main(String[] args) {
		
		//  [step 1] --- create instance variables for the two classes Nogo1 and Nogo2 and explain the outcome.
		Nogo1 n1;
		Nogo2 n2;
		/*Outcome: allocates memory space for two variables which can store the
		 *  memory address of a Nogo1 / Nogo2 object, of any of their subclasses*/
		
		// step 3 create a Go1 object..
		Go1 g1 = new Go1();
		/*Outcome: because Go1 extends from Nogo1, Go1's constructor makes a call to
		 * Nogo1's constructor, then continues executing the statements in Go1*/
		
		
		
		// step 6 here
		Go9 g9 = new Go9();
		g9.nMethod();
	}
}





