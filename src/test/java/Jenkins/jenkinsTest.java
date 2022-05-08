package Jenkins;

import org.testng.annotations.Test;

public class jenkinsTest {
@Test
public void jenkinsTest() {
	System.out.println("execute create org test");
	String BROWSER = System.getProperty("browser");
	String URL=System.getProperty("url");
	System.out.println("BROWSER====>"+BROWSER+"  ,URL====>"+URL);
}
}
