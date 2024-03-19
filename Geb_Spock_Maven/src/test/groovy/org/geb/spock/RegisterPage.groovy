package org.geb.spock

import geb.Browser
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//def driver = new Browser(driver: new ChromeDriver());

Browser.drive {
    go("https://www.westernunion.com/")
//print(driver.availableWindows.parallelStream().collect().asList());
//assert driver.$("a[amplitude-id='menu-send-money']").first().children("span").text()  == "Send money";
//driver.$("a[amplitude-id='menu-send-money']").first().children("span").click();

    assert $("a[amplitude-id='menu-signup']").children("span").text() == "Register"
    $("a[amplitude-id='menu-signup']").children("span").click()

    Thread.sleep(5000)
    $("input#firstName").value("mahendar")
    $("input#middleName").value("reddy")
    $("input#lastName").value("mahi")
//driver.$("input#").value("02/01/2024")
    $(By.id("dob")).value("02/01/2024")
    Thread.sleep(5000)

    quit();
}
