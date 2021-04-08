package Demo;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class TestCase
{
	
	@BeforeClass
	public static void beforeclassmethod()
	{
		System.out.println("Before Class");
	}
	@Before
	public void beforetestcase()
	{
		System.out.println("Before Testcase");
	}
	

	@Test
	public void test() {
		//System.out.println("Your actual Test Case");
		//assertEquals(4,FindResult.FindMaxNum(new int[] {1,2,3,4}));
		//System.out.println("TestCases passed");
		assertTrue(FindResult.evenORodd(4));
		//System.out.println("TestCases passed");
		assertTrue(FindResult.evenORodd(2));
		assertTrue(FindResult.evenORodd(3));
		assertFalse(FindResult.evenORodd(3));
		
		
	}
	@After
	public void aftertestcase()
	{
		System.out.println("After Testcase");
	}
	@AfterClass
	public static void afterclass()
	{
		System.out.println("After Testcase");
	}

}
