package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerSuite1 {
	

	
	@Test
	public void tc() {

	Result run = JUnitCore.runClasses(Test1.class,Test2.class,Test3.class);
	
	    int count = run.getRunCount();
	    System.out.println(count);
	    
	   // Class<? extends Result> class1 = run.getClass();
	   // System.out.println(class1);
	    
	    int failureCount = run.getFailureCount();
	    System.out.println(failureCount);
	    
	    List<Failure> failures = run.getFailures();
	    System.out.println(failures);
	}
	
	
	
	
	
	
	
	

}
