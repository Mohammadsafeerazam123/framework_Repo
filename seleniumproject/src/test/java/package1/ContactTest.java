package package1;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		System.out.println("url is "+url);
		System.out.println("browser name is "+browser);
		System.out.println("username is "+username);
		System.out.println("password is "+password);
		System.out.println("Executed create Contact Test");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("Executed modify Contact Test");
		
		// Repo url https://github.com/Mohammadsafeerazam123/framework_Repo.git
	}

}
