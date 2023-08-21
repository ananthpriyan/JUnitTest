import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitSampleTest {
	
	
  @BeforeClass
  
  public static void beforeClass() {
	
	  System.out.println("Browser config and Launch Browser");
}
  @AfterClass
  public static void afterClass() {
	
	  System.out.println("Close /Quit browser");
}

  @Before
  public void before() {
	System.out.println("Start time and ScreenShots");

}
  @After
   public void after() {
	  System.out.println("Endtime and Screenshots");
}
  
  @Test
  public void tc2() {
	
	  System.out.println("TC2");
                                        // It is always prints in ascending order 
}
  
  
  @Test
  public void tc1() {
        System.out.println("TC1");

}
  
}
