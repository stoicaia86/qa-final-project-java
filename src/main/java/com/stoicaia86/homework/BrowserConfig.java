// Fișier: BrowserConfig.java

public class BrowserConfig {
    // Câmpuri private
    private BrowserType browser;
    private String version;
    private boolean isHeadless;


    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;

    }

    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false); // Apelăm primul constructor (chaining)
    }

    public BrowserConfig(BrowserType browser) {
        this(browser, "latest", true); // Apelăm al doilea constructor (chaining)
    }

    //  Metodă statică "Factory"
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }


public void afiseazaConfig() {
    System.out.println(
            "Detalii BrowserConfig:" +
                    "\n  - Browser: " + this.browser +
                    "\n  - Version: " + this.version +
                    "\n  - isHeadless: " + this.isHeadless);
}
}


