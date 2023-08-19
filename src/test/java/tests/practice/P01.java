package tests.practice;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ArabamPage;
import utils.Driver;
import utils.ReusableMethods;

public class P01 {
    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    TouchAction action;
    ArabamPage arabamPage;

    public P01() {
        this.action = new TouchAction(this.driver);
        this.arabamPage = new ArabamPage();
    }

    @Test
    public void arabamTest2() throws InterruptedException {
        //Uygulamanin basarili bir sekilde yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("com.dogan.arabam"));
        //Uygulamanin basarili bir sekilde goruntulendigi dogrulanir
        AndroidElement check = driver.findElementById("com.dogan.arabam:id/tvShowroomInfo");
        Assert.assertTrue(check.isDisplayed());
        //Anasayfada garaj bolumune tiklanir
        this.arabamPage.garaj.click();
        Thread.sleep(500);
        //Acilan sayfada  atlaya tiklanir
        this.arabamPage.atla.click();
        Thread.sleep(500);
        //Acilan sayfada servis bakim bolumune tiklanir
        this.arabamPage.servisBakim.click();
        //Periyodik bakim bolumune tiklanir
        this.arabamPage.periyodikBakim.click();
        //Volkswagen markasina tiklanir
        Thread.sleep(3000);
        ReusableMethods.screenScroll(537, 1779, 100, 544, 248);
        Thread.sleep(500);
        this.arabamPage.volkswagen.click();
        Thread.sleep(500);
        //Arac yili secilir
        this.arabamPage.arabaYil.click();
        Thread.sleep(500);
        //Arac modeli secilir
        this.arabamPage.marka.click();
        Thread.sleep(500);
        //Kasa tipi secilir
        this.arabamPage.kasaTipi.click();
        Thread.sleep(500);
        //Yakit turu secilir
        this.arabamPage.yakitTuru.click();
        Thread.sleep(500);
        //Vites tipi secilir
        this.arabamPage.vitesTuru.click();
        Thread.sleep(500);
        //Versiyon secilir
        this.arabamPage.version1.click();
        Thread.sleep(500);
        //KmBox tiklanir ve aracin km'si girilir
        this.arabamPage.kmBox.click();
        if (driver.isKeyboardShown()) {
            driver.getKeyboard().pressKey("100000");
        }else {
            this.arabamPage.kmBox.sendKeys("150000");
        }
            Thread.sleep(1000);
            action.press(PointOption.point(939,1710)).release().perform();
            //Servisleri gor butonu tiklanir
            this.arabamPage.servisleriGor.click();
            //izin ver butonu tiklanir
            this.arabamPage.izinVer.click();
            //Allow only while using app butonu tiklanir
            this.arabamPage.allowOnlyWhileUsingApp.click();
            Thread.sleep(20000);
            //garaja don butonu tiklanir
            this.arabamPage.garajaDon.click();
            Thread.sleep(500);
            //Garaj sayfasinin goruntulendigi dogrulanir
            Assert.assertTrue(this.arabamPage.garajAnaSayfa.isDisplayed());
            //App kapatilir
            driver.closeApp();


        }
    }
