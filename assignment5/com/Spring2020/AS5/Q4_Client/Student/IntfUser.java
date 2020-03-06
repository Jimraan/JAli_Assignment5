package com.Spring2020.AS5.Q4_Client.Student;
import com.Spring2020.AS5.Q4.Student.*;

public class IntfUser implements Intf1, Intf2{
	@Override
	public void countThree() {
		System.out.println("THREE");
	}

	@Override
	public void countOne() {
		System.out.println("ONE");
	}

	@Override
	public void countTwo() {
		System.out.println("TWO");
	}
}
