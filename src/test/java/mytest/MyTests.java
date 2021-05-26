package mytest;
import org.testng.Assert;
import org.testng.annotations.Test;



public class MyTests {

	//@Test(retryAnalyzer = Analyzer.RetryAnalyzer.class)
	@Test
	public void Test1()
	{
		System.out.println("Updated the code after cloning from github");
		Assert.assertEquals(false, true);
		System.out.println("After pulling and updating the file");
		System.out.println("New Branch-develop created");
	}
	
	//@Test(retryAnalyzer = Analyzer.RetryAnalyzer.class)
	@Test
	public void Test2()
	{
		
		Assert.assertEquals(false, true);
		
	}
	
	@Test
	public void Test3()
	{
		
		Assert.assertEquals(true, true);
	}
	
	
	
}
