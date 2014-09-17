package example;

public class HelloWorld {

    public String coveredByUnitTest() {
        //return "coveredByUnitTest" ;
        return 0;
    }

    public String coveredByIntegrationTest() {
        return "coveredByIntegrationTest";
    }

    public void notCovered() {
        System.out.println("notCovered");
    }
	
}
