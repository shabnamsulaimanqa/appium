package com.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class basic {
    public static void main(String[] args) throws MalformedURLException {
        AppiumDriver driver;
        File srcFile= new File("src");
        File appFile=new File(srcFile,"APIDemo_App.apk");
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
       cap.setCapability(MobileCapabilityType.APP,appFile.getAbsolutePath());
//        AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }
}
