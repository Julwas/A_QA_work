package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import service.WaitService;
import utils.configuration.ReadProperties;

import java.time.Duration;

public abstract class  BasePage {
    protected WebDriver driver;
    private static final int WAIT_FOR_PAGE_LOAD_IN_SECONDS = 30;

    public BasePage(WebDriver driver) throws InterruptedException {
        this.driver = driver;

        waitForOpen();
        waitForOpenNew();
    }



    public void openPageByUrl(String pagePath) {
        driver.get(ReadProperties.getUrl() + pagePath);
    }

    protected abstract By getPageIdentifier();

    public boolean isPageOpened() {//обрамляем что бы получить значение true/false
        try{
            WaitService waitService = new WaitService(driver, Duration.ofSeconds(WAIT_FOR_PAGE_LOAD_IN_SECONDS));
        //return driver.findElement(getPageIdentifier()).isDisplayed();
            return waitService.waitForExists(getPageIdentifier()).isDisplayed();
    /*}catch (Exception ex){
        return false;
        }*/
    }

    private void waitForOpen() throws InterruptedException {/*//расчет времени сколько грузится страница
        int tryCount = 0;//счетчик
        boolean isPageOpenendIndicator = isPageOpened(); //создаем пееменную

        while (!isPageOpenendIndicator &&
                tryCount < WAIT_FOR_PAGE_LOAD_IN_SECONDS) {//увел ко-во попыток если времяменьше 30с
            Thread.sleep(1000);
            tryCount++;
            isPageOpenendIndicator = isPageOpened();
        }
        if (!isPageOpened()){//если false то пробрасываем ошибку
            throw new AssertionError("Page was not loaded...");
        }*/
    }
    private void waitForOpenNew(){
        if(!isPageOpened()){
            throw new AssertionError("Page was not loaded...");
        }
    }
}
