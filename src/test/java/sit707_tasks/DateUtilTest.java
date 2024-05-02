package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223418666";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Shreeyut Shrestha";
		Assert.assertNotNull("Student name is null", studentName);
	}

	
	
	@Test
	public void testIncrementD2M1orM2() {
		DateUtil date = new DateUtil(29, 1, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(30, date.getDay());
	}
	@Test
	public void testIncrementD1M3Y1() {
		DateUtil date = new DateUtil(28, 2, 2000);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(29, date.getDay());
	}
	@Test
	public void testIncrementD1M3Y2() {
		DateUtil date = new DateUtil(28, 2, 2001);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	@Test
	public void testIncrementD2M3Y1() {
		DateUtil date = new DateUtil(29, 2, 2000);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	@Test
	public void testIncrementD3M1() {
		DateUtil date = new DateUtil(30, 4, 2001);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(5, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	@Test
	public void testIncrementD3M2() {
		DateUtil date = new DateUtil(30, 1, 2001);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(31, date.getDay());
	}
	@Test
	public void testIncrementD4M2() {
		DateUtil date = new DateUtil(31, 3, 2001);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	@Test
	public void testDecrementD1M1orM3() {
		DateUtil date = new DateUtil(1, 4, 2001);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(31, date.getDay());
	}
	@Test
	public void testDecrementD1M2Y1() {
		DateUtil date = new DateUtil(1, 3, 2000);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(29, date.getDay());
	}
	@Test
	public void testDecrementD1M2Y2() {
		DateUtil date = new DateUtil(1, 3, 2001);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(28, date.getDay());
	}
	@Test
	public void testDecrementD2M3Y1() {
		DateUtil date = new DateUtil(29, 2, 2000);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(28, date.getDay());
	}
}
