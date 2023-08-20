package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ArabamPage {
    public ArabamPage() {
        PageFactory.initElements(Driver.getAndroidDriver(), this);
    }
    @FindBy(id = "com.dogan.arabam:id/tvGarageBanner")
    public WebElement garaj;
    @FindBy(id = "com.dogan.arabam:id/textViewSkip")
    public WebElement atla;
    @FindBy(xpath = "//*[@text='Servis / Bakım']")
    public WebElement servisBakim;
    @FindBy(id = "com.dogan.arabam:id/textViewTitle")
    public WebElement periyodikBakim;
    @FindBy(xpath = "//*[@text='Volkswagen']")
    public WebElement volkswagen;
    @FindBy(xpath = "//*[@text='2014']")
    public WebElement arabaYil;
    @FindBy(xpath = "//*[@text='Passat']")
    public WebElement marka;
    @FindBy(xpath = "//*[@text='Sedan']")
    public WebElement kasaTipi;
    @FindBy(xpath = "//*[@text='Benzin']")
    public WebElement yakitTuru;
    @FindBy(xpath = "//*[@text='Düz']")
    public WebElement vitesTuru;
    @FindBy(id = "com.dogan.arabam:id/editTextPrice")
    public WebElement kmBox;
    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public WebElement version1;
    @FindBy(id = "com.dogan.arabam:id/btnShowService")
    public WebElement servisleriGor;
    @FindBy(id = "com.dogan.arabam:id/btnGarageInfo")
    public WebElement izinVer;
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement allowOnlyWhileUsingApp;
    @FindBy(id = "com.dogan.arabam:id/btnGarageInfo")
    public WebElement garajaDon;
    @FindBy(id = "com.dogan.arabam:id/imageViewToolbar")
    public WebElement garajAnaSayfa;




    //Ilan Ara
    @FindBy(id = "com.dogan.arabam:id/tvAdvertSearch")
    public WebElement ilanAra;
    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[4]")
    public WebElement otomobil;
    @FindBy(xpath = "//*[@text='Golf']")
    public WebElement golf;
    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[20]")
    public WebElement aracTuru;
    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[6]")
    public WebElement aracTuru2;
    @FindBy(id = "com.dogan.arabam:id/textViewFilter")
    public WebElement filtrele;
    @FindBy(xpath = "//*[@text='Fiyat']")
    public WebElement filtreFiyat;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement fiyatEnAz;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement fiyatEnFazla;
    @FindBy(id = "com.dogan.arabam:id/buttonConfirm")
    public WebElement tamam;
    @FindBy(xpath = "//*[@text='Yıl']")
    public WebElement yil;
    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[10]")
    public WebElement aracYas;
    @FindBy(xpath = "//*[@text='Vites Tipi']")
    public WebElement vitesTipi;
    @FindBy(xpath = "//*[@text='Yakıt Tipi']")
    public WebElement yakitTipi;
    @FindBy(id = "com.dogan.arabam:id/checkbox")
    public WebElement dizel;
    @FindBy(xpath = "//*[@text='Kilometre']")
    public WebElement kilometre;
    @FindBy(xpath = "//*[@text='Kasa Tipi']")
    public WebElement kasaTipiFiltre;
    @FindBy(id = "com.dogan.arabam:id/checkbox")
    public WebElement kasaTipiButton;
    @FindBy(xpath = "//*[@text='Renk']")
    public WebElement renk;
    @FindBy(id = "com.dogan.arabam:id/checkbox")
    public WebElement renkButton;
    @FindBy(id = "com.dogan.arabam:id/buttonApplyFilter")
    public WebElement ilanlarigoster;
    @FindBy(id = "com.dogan.arabam:id/tvTitle")
    public WebElement ilanaTikla;
    @FindBy(xpath = "//*[@text='Ana Sayfa']")
    public WebElement anaSayfa;
















}

