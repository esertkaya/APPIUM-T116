package tests.practice;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ArabamPage;
import utils.Driver;
import utils.ReusableMethods;

public class P02 {
    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    TouchAction action;
    ArabamPage arabamPage;

    public P02() {
        this.action = new TouchAction(this.driver);
        this.arabamPage = new ArabamPage();
    }

    @Test
    public void arabamTest03() throws InterruptedException {
        //Uygulamanin basarili bir sekilde yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("com.dogan.arabam"));
        //Uygulamanin basarili bir sekilde goruntulendigi dogrulanir
        AndroidElement check = driver.findElementById("com.dogan.arabam:id/tvShowroomInfo");
        Assert.assertTrue(check.isDisplayed());
        this.arabamPage.ilanAra.click();
        this.arabamPage.otomobil.click();
        Thread.sleep(5000);
        ReusableMethods.screenScroll(526, 1604, 100, 530, 245);
        Thread.sleep(500);
        this.arabamPage.volkswagen.click();
        this.arabamPage.golf.click();
        Thread.sleep(500);
        this.arabamPage.aracTuru.click();
        this.arabamPage.aracTuru2.click();
        Thread.sleep(5000);
        this.arabamPage.filtrele.click();
        Thread.sleep(5000);
        this.arabamPage.filtreFiyat.click();
        this.arabamPage.fiyatEnAz.click();
        if (driver.isKeyboardShown()) {
            driver.getKeyboard().pressKey("1000000");
        } else {
            this.arabamPage.fiyatEnAz.sendKeys("2000000");
        }
        this.arabamPage.fiyatEnFazla.click();
        if (driver.isKeyboardShown()){
            driver.getKeyboard().pressKey("1500000");
        }else{
            this.arabamPage.fiyatEnFazla.sendKeys("2500000");
        }
        this.arabamPage.tamam.click();
        Thread.sleep(500);
        this.arabamPage.yil.click();
        Thread.sleep(500);
        this.arabamPage.aracYas.click();
        this.arabamPage.tamam.click();
        Thread.sleep(500);
        this.arabamPage.vitesTipi.click();
        Thread.sleep(500);
        this.arabamPage.vitesTuru.click();
        Thread.sleep(500);
        this.arabamPage.tamam.click();
        Thread.sleep(1000);
        this.arabamPage.yakitTipi.click();
        this.arabamPage.dizel.click();
        this.arabamPage.tamam.click();
        Thread.sleep(500);
        this.arabamPage.kilometre.click();
        Thread.sleep(500);
        this.arabamPage.fiyatEnAz.click();
        if (driver.isKeyboardShown()) {
            driver.getKeyboard().pressKey("100000");
        } else {
            this.arabamPage.fiyatEnAz.sendKeys("50000");
        }
        this.arabamPage.fiyatEnFazla.click();
    if (driver.isKeyboardShown()){
        driver.getKeyboard().pressKey("200000");
    }else{
        this.arabamPage.fiyatEnFazla.sendKeys("150000");
    }
        this.arabamPage.tamam.click();
        Thread.sleep(500);
        this.arabamPage.kasaTipiFiltre.click();
        Thread.sleep(500);
        this.arabamPage.kasaTipiButton.click();
        this.arabamPage.tamam.click();
        Thread.sleep(500);
        ReusableMethods.screenScroll(482,1604,500,532,267);
        Thread.sleep(500);
        this.arabamPage.renk.click();
        Thread.sleep(500);
        this.arabamPage.renkButton.click();
        this.arabamPage.tamam.click();
        Thread.sleep(500);
        this.arabamPage.ilanlarigoster.click();
        Thread.sleep(1000);
       // this.arabamPage.ilanaTikla.click();
       // Thread.sleep(500);
        this.arabamPage.anaSayfa.click();
        Assert.assertTrue(arabamPage.garaj.isDisplayed());
        driver.closeApp();















    }

}
