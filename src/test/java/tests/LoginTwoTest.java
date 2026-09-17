package tests;

import base.BaseTest;
import pages.LoginPage;
import org.junit.jupiter.api.*;
public class LoginTwoTest extends BaseTest {
    @BeforeEach
    void start() {
        setup();
    }
    @AfterEach
    void end() {
        tearDown();
    }
    @Test
    void loginTest2() {
        LoginPage login = new LoginPage(page);
        login.openWebsite();
        login.login("student", "Password123");

        System.out.println("Test2 : " + login.getSuccessMessage());
    }
}
