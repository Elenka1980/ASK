package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static support.TestContext.getDriver;

public class Userconvert {
    @And("I click {string}")
    public void iClick(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Users Management')]")).click();
        Thread.sleep(2000);
    }

    @And("I select student on users management page {string}")
    public void iSelectStudentOnUsersManagementPage(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Vladimir Vladimirov')]")).click();
        Thread.sleep(2000);
    }

    @And("I click {string} button")
    public void iClickButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//button[@class='mat-raised-button mat-accent']")).click();
        Thread.sleep(2000);
    }

    @Then("I select option \"([^\"]*)\"$")
    public void iSelectOption(String arg) throws Throwable {
        getDriver().findElement(By.xpath("//body//button[2]")).click();
        Thread.sleep(2000);
    }

    @And("I click {string} sign")
    public void iClickSign(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//button[@class='mat-button mat-warn']")).click();
        Thread.sleep(2000);
    }

    @And("I click {string} tab")
    public void iClickTab(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//div[contains(text(),'Teachers')]")).click();
        Thread.sleep(2000);
    }

    @And("I select Teacher on users management page {string}")
    public void iSelectTeacherOnUsersManagementPage(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Vladimir Vladimirov')]")).click();
        Thread.sleep(2000);
    }
}