-  JDK 1.8 must be installed.
-  Android Studio (https://developer.android.com/studio) should be downloaded and installed.
-  Set the ANDROID_HOME (Sdk) and PATH (platform-tools) environment variables in Windows.
-  Now open the CMD with administrator privileges and type adb --version and hit enter.
-  Go to the playstore and paste the link: https://play.google.com/store/apps/details?id=com.google.android.calculator
-  Then go to https://apps.evozi.com/apk-downloader, paste your copied URL here and click on the "Generate Download Link" button.
-  Android Studio->File->Open->com.google.android.calculator. Then select AndroidManifest.xml. We have to retrieve two main things here. 
   1. package name (com.google.android.calculator) 
   2. main Activity name (com.android.calculator2.Calculator) 

-  Before connecting the mobile device, you must enable "USB debugging" from the developer option. Go to settings->Tap on "About Phone"->Tap three times on "Build Number"->Then go to System->Tap on "Developer Options"->Enable "USB debugging". Now connect your mobile device with your PC via USB. Now allow USB debugging from your mobile phone. Open the CMD with administrator privileges and type "adb devices". You will get the UUID number if the device is connected properly to the PC and allows USB 
debugging from the phone.
-  Appium (https://appium.io/downloads.html) be installed. Run the Appium Server GUI. Click on the appium inspector session. Now add the desired capabilities from the below JSON representation and start the session.
  
```sh  
{
  "deviceName": "Pixel_4",
  "uuid": "emulator-5554",
  "platformName": "Android",
  "platformVersion": "11",
  "appPackage": "com.google.android.calculator",
  "appActivity": "com.android.calculator2.Calculator"
}
```

## Run The Automation Script
```sh
Terminal: gradle clean test
```

## Run The Allure
```sh
Terminal: allure generate allure-results --clean -o allure-report
Terminal: allure serve allure-results
```
