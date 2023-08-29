package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/*public class SelenideTest {

    @Test
    public void E2ESelenideTest() {
        open(ReadProperties.getUrl());
        $(By.id("user-name")).setValue(ReadProperties.username());
        $("#password").val(ReadProperties.password());
        $("#login-button").click();
        $(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        $(By.id("shopping_cart_container")).click();
        $(By.id("checkout")).click();
        $(By.id("first-name")).setValue(ReadProperties.username());
        $(By.id("last-name")).setValue(ReadProperties.username());
        $(By.id("postal-code")).setValue(ReadProperties.username());
        $(By.id("continue")).click();
        $(By.id("finish")).click();
        $(By.className("complete-header")).shouldBe(visible, Duration.ofSeconds(35))
                .should(text("Thank you for your order!"));
        $("#back-to-products").click();
        $(By.className("title")).shouldBe(visible).shouldHave(text("Products"));
    }
}
*/