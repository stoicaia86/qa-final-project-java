// Fișier: TestConfigRunner.java

public class TestConfigRunner {
    public static void main(String[] args) {
        // 1️⃣ Instanță folosind constructorul cu 3 parametri
        BrowserConfig c1 = new BrowserConfig(BrowserType.FIREFOX, "125.0", true);

        // 2️⃣ Instanță folosind constructorul cu 2 parametri
        BrowserConfig c2 = new BrowserConfig(BrowserType.EDGE, "124.0");

        // 3️⃣ Instanță folosind constructorul cu 1 parametru
        BrowserConfig c3 = new BrowserConfig(BrowserType.CHROME);

        // 4️⃣ Instanță folosind metoda statică factory
        BrowserConfig c4 = BrowserConfig.createDefaultChromeConfig();

        // Afișăm toate configurațiile
        System.out.println("=== CONFIG 1 ===");
        c1.afiseazaConfig();

        System.out.println("=== CONFIG 2 ===");
        c2.afiseazaConfig();

        System.out.println("=== CONFIG 3 ===");
        c3.afiseazaConfig();

        System.out.println("=== CONFIG 4 (Factory) ===");
        c4.afiseazaConfig();
    }
}
