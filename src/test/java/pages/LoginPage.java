package pages;

import com.microsoft.playwright.Page;
public class LoginPage {
    private Page page;
    public LoginPage(Page page) {
        this.page = page;
    }
    String username = "#username";
    String password = "#password";
    String loginBtn = "#submit";
    String successMsg = ".post-title";
    public void openWebsite() {
        page.navigate("https://practicetestautomation.com/practice-test-login/");
    }
    public void login(String user, String pass) {
        page.fill(username, user);
        page.fill(password, pass);
        page.click(loginBtn);
    }
    public String getSuccessMessage() {
        return page.locator(successMsg).textContent();
    } }
