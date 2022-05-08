package getPropProg;

import org.testng.annotations.Test;

public class getPropertyProgrammeTest {
@Test
public void getPropertyProg() {
	String BROWSER = System.getProperty("browser");
	System.out.println(BROWSER);
	
	String URL = System.getProperty("url");
	System.out.println(URL);
}
}
