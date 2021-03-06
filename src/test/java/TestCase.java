import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.MalformedURLException;

public class TestCase extends BasePage {

    @FindBy(id = "com.google.android.calculator:id/digit_0")
    MobileElement btn0;
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    MobileElement btn1;
    @FindBy(id = "com.google.android.calculator:id/digit_2")
    MobileElement btn2;
    @FindBy(id = "com.google.android.calculator:id/digit_3")
    MobileElement btn3;
    @FindBy(id = "com.google.android.calculator:id/digit_4")
    MobileElement btn4;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    MobileElement btn5;
    @FindBy(id = "com.google.android.calculator:id/digit_6")
    MobileElement btn6;
    @FindBy(id = "com.google.android.calculator:id/digit_7")
    MobileElement btn7;
    @FindBy(id = "com.google.android.calculator:id/digit_8")
    MobileElement btn8;
    @FindBy(id = "com.google.android.calculator:id/digit_9")
    MobileElement btn9;


    //------------------Button Extra--------------------//

    @FindBy(id = "com.google.android.calculator:id/dec_point")
    MobileElement btnPoint;

    @FindBy(id = "com.google.android.calculator:id/op_pct")
    MobileElement btnPercent;

    @FindBy(id = "com.google.android.calculator:id/op_sqrt")
    MobileElement btnRoot;

    @FindBy(id = "com.google.android.calculator:id/const_pi")
    MobileElement btnPy;


    //----------------Button Logical Expression--------------------//

    @FindBy(id = "com.google.android.calculator:id/op_add")
    MobileElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    MobileElement btnSub;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    MobileElement btnMul;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    MobileElement btnDiv;


    //-----------------Button Function --------------------//

    @FindBy(id = "com.google.android.calculator:id/result_preview")
    MobileElement btnPreview;
    @FindBy(id = "com.google.android.calculator:id/eq")
    MobileElement btnEqual;
    @FindBy(id = "com.google.android.calculator:id/result_final")
    MobileElement btnRes;

    @FindBy(id = "com.google.android.calculator:id/del")
    MobileElement btnDel;
    @FindBy(id = "com.google.android.calculator:id/clr")
    MobileElement btnCancel;

    public TestCase() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(AppLaunch.driver), this);
    }

    public String doSum() throws InterruptedException, MalformedURLException {
        btn5.click();
        btnPlus.click();
        btn7.click();
        btnEqual.click();
        return btnRes.getText();
    }

    public String doMul() throws InterruptedException, MalformedURLException {
        btnCancel.click();
        btn5.click();
        btnMul.click();
        btn7.click();
        btnEqual.click();
        return btnRes.getText();
    }
}
