package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 21/02/2017.
 */
public class NewTrip {

    public void name(String tripName){
        WebElement tripNameBox = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-2']/page-newtrip/ion-content" +
                "/div[2]/form/ion-list/ion-item[1]/div[1]/div/ion-input/input"));

        tripNameBox.sendKeys(tripName);
    }

    public void location(String tripLocation){
        WebElement tripLocationBox = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-2']/page-newtrip" +
                "/ion-content/div[2]/form/ion-list/ion-item[2]/div[1]/div/ion-input/input"));

        tripLocationBox.sendKeys(tripLocation);
    }

    public void description(String tripDescription){
        WebElement tripDescriptionBox = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-2']/page-newtrip" +
                "/ion-content/div[2]/form/ion-list/ion-item[3]/div[1]/div/ion-textarea/textarea"));

        tripDescriptionBox.sendKeys(tripDescription);
    }

    public void startDate() throws InterruptedException {
        WebElement startDateBtn = driver.findElement(By.id("dt-7-0"));

        startDateBtn.click();

        WebElement doneBtn = driver.findElement(By.xpath("html/body/ion-app/ion-picker-cmp/div/div[1]/div[2]/button"));

        WebElement dateSelector = driver.findElement(By.xpath("html/body/ion-app/ion-picker-cmp/div" +
                "/div[2]/div[2]/div/button[26]"));
        WebElement monthSelector = driver.findElement(By.xpath("html/body/ion-app/ion-picker-cmp/div/div[2]" +
                "/div[3]/div/button[5]"));
        WebElement yearSelector = driver.findElement(By.xpath("html/body/ion-app/ion-picker-cmp/div" +
                "/div[2]/div[4]/div/button[4]"));

        Thread.sleep(1000);
        dateSelector.click();
        monthSelector.click();
        yearSelector.click();

        Thread.sleep(1000);
        doneBtn.click();
    }

    public void startTime() {

    }

    public void endDate() throws InterruptedException {
        WebElement endDateBtn = driver.findElement(By.id("dt-7-0"));

        endDateBtn.click();

        WebElement doneBtn = driver.findElement(By.xpath("html/body/ion-app/ion-picker-cmp/div/div[1]/div[2]/button"));

        WebElement dateSelector = driver.findElement(By.xpath("html/body/ion-app/ion-picker-cmp/div" +
                "/div[2]/div[2]/div/button[26]"));
        WebElement monthSelector = driver.findElement(By.xpath("html/body/ion-app/ion-picker-cmp/div" +
                "/div[2]/div[3]/div/button[7]"));
        WebElement yearSelector = driver.findElement(By.xpath("html/body/ion-app/ion-picker-cmp/div" +
                "/div[2]/div[4]/div/button[4]"));

        Thread.sleep(1000);
        dateSelector.click();
        monthSelector.click();
        yearSelector.click();

        Thread.sleep(1000);
        doneBtn.click();
    }

    public void ends() {

    }

    public void transport(String tripTransport) {
        WebElement tripTransportBox = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-2']/page-newtrip" +
                "/ion-content/div[2]/form/ion-list/ion-item[8]/div[1]/div/ion-input/input"));

        tripTransportBox.sendKeys(tripTransport);
    }

    public void friends() throws InterruptedException {
        WebElement tripViewBtn = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-2']/page-newtrip/ion-content" +
        "/div[2]/ion-list[1]/ion-item/div[1]/button"));

        tripViewBtn.click();

        WebElement backdrop = driver.findElement(By.xpath("html/body/ion-app/ion-modal/ion-backdrop"));

        Thread.sleep(1000);

        WebElement firstCheckBox = driver.findElement(By.xpath("html/body/ion-app/ion-modal/div/page-friendsmodal" +
                "/ion-content/div[2]/ion-list/ion-item[1]/div/ion-checkbox"));
        WebElement secondCheckBox = driver.findElement(By.xpath("html/body/ion-app/ion-modal/div/page-friendsmodal" +
                "/ion-content/div[2]/ion-list/ion-item[2]/div/ion-checkbox"));

        firstCheckBox.click();
        secondCheckBox.click();

        backdrop.click();

    }

    public void addItem(String tripItem, String tripDescription) throws InterruptedException {

        item(tripItem);
        shortDescription(tripDescription);

        WebElement addItemBtn = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-2']/page-newtrip/ion-content" +
                "/div[2]/ion-list[2]/div/button"));

        Thread.sleep(1000);

        addItemBtn.click();
    }

    public void addTrip(){
        WebElement addTripBtn = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-2']/page-newtrip/ion-content" +
                "/div[2]/div/button"));

        addTripBtn.click();
    }

    private void item(String tripItem){
        WebElement tripItemBox = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-2']/page-newtrip/ion-content" +
                "/div[2]/ion-list[2]/ion-item[1]/div[1]/div/ion-input/input"));

        tripItemBox.sendKeys(tripItem);
    }

    private void shortDescription(String tripDescription){
        WebElement tripItemDescriptionBox = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-2']/page-newtrip" +
                "/ion-content/div[2]/ion-list[2]/ion-item[2]/div[1]/div/ion-input/input"));

        tripItemDescriptionBox.sendKeys(tripDescription);
    }

}
