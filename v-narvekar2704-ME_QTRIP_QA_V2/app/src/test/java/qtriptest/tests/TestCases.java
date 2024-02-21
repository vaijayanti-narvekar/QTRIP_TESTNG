// package qtriptest.tests;

// import qtriptest.pages.*;
// import org.testng.Assert;
// import org.testng.annotations.*;
// import org.openqa.selenium.remote.BrowserType;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;
// import java.net.MalformedURLException;
// import java.net.URL;


// public class TestCases {

//     static RemoteWebDriver driver;
//     static String LastGeneratedName;

//     @BeforeSuite(alwaysRun = true)
// 	public static void createDriver() throws MalformedURLException {
// 		logStatus("driver", "Initializing driver", "Started");
// 		final DesiredCapabilities capabilities = new DesiredCapabilities();
// 		capabilities.setBrowserName(BrowserType.CHROME);
// 		driver = new RemoteWebDriver(new URL("http://localhost:8082/wd/hub"), capabilities);
// 		logStatus("driver", "Initializing driver", "Success");
// 	}

//     public static void logStatus(String type, String message, String status) {

//         System.out.println(String.format("%s |  %s  |  %s | %s", String.valueOf(java.time.LocalDateTime.now()), type,
//                 message, status));

//     }

//     @Test(description = "Verify User Registration", enabled = true)
// 	public static void testLogin_verifyUserLoggedIn() {
// 		logStatus("Login Page test", "verify login", "started");
// 		try {
//             HomePage home = new HomePage(driver);
//             home.navigateToHomePage();
//             Thread.sleep(3000);
//             home.clickRegister();

// 			// RegisterPage register = new RegisterPage(driver);
//             // register.registerNewUser("example@gmail", "abcd123123!@#", true);
            
//             // LoginPage login = new LoginPage(driver);
// 			// login.performLogin(register.lastGeneratedUsername, "abcd123123!@#");

//         	// Boolean status = home.isUserLoggedIn();
// 			// Assert.assertTrue(status, "Login Failed");
//             // logStatus("Login Page test", "verify login", "success");

//             // home.logOutUser();

// 		} catch (Exception e) {
// 			logStatus("Login Page test", "verify login", "failed");
// 			e.printStackTrace();
// 		}
// 	}


  
//     @AfterSuite
//     public static void quitDriver()
//     {
//         driver.close();
//         driver.quit();
// 		logStatus("driver", "Quitting driver", "Success");
//     }

    
// }
