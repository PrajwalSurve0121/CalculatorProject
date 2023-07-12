package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Dao.CalImple;

class TestCal {

	CalImple c=new CalImple();

	@Test
	void test() {
		int output=c.Addition(5, 4);
		assertEquals(9, output);
	}
	@Test
	void test1()
	{
		int output=c.Substraction(4, 3);
		assertEquals(1, output);
	}
	@Test
	void test2()
	{
		int output=c.Multiplication(4, 3);
		assertEquals(12, output);
	}
	@Test
	void test3()
	{
		int Output=c.Division(55, 5);
		assertEquals(11, Output);
	}

}
