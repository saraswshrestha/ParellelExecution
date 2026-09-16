package tests;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;
public class Test_anno {
    @Test
    public void loginTest() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://practicetestautomation.com/practice-test-login/");
            page.fill("#username", "student");
            page.fill("#password", "Password123");
            page.click("#submit");
            String message = page.locator(".post-title").textContent();
            System.out.println(message);

            browser.close();
        }
    }
}