package testng;

import org.testng.annotations.Test;

public class GroupTest {

	
	@Test (groups =  "sanity" )
	public void sanityTest1() {
		System.out.println("This is sanity test");
	}
	
	@Test(groups = { "sanity", "db" } )
	public void sanity_dbTest2() {
		System.out.println("This is sanity and db test");
	}
	
	@Test (groups = {"regression", "db"} )
	public void regression_dbTest3() {
		System.out.println("This is regression and db test");
	}
	
	@Test(dependsOnGroups= {"sanity", "regression"})
    public void DependantTest(){
        System.out.println("This is dependant test");
    }
}
