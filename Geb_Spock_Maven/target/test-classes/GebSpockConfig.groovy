import geb.Browser

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import java.util.logging.Level
import java.util.logging.Logger


Logger logger = Logger.getLogger("");
logger.setLevel(Level.OFF);


driver = new Browser(driver: new ChromeDriver());

environments {

    chrome {
        driver = { new ChromeDriver() }
    }

    firefox {
        driver = { new FirefoxDriver() }
    }
}

baseUrl = "https://www.westernunion.com/"
reportDir = "./target/report"

spockReports {
    set 'com.athaydes.spockframework.report.showCodeBlocks': true
    set 'com.athaydes.spockframework.report.outputDir': 'target/spock-reports'
}