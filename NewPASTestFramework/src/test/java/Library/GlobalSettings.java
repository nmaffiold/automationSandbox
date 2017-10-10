package Library;

public class GlobalSettings {


    // Settings grabs Key/Value pairs from config.properties
    public static Settings settings = new Settings();

    // Set the environment variables
    public static String initDriverType() { return initEnvVariable("driver"); }

    public  static String initRemoteHub() {
        return  initEnvVariable("remoteHub");
    }

    public String initBaseUrl() { return initEnvVariable("baseUrl"); }

    public String initBrowser() {
        return initEnvVariable("browser");
    }

    // Doing the donkey work here
    private static String initEnvVariable(String variable) {
        String value = System.getProperty(variable);
        if (value != null)
            return value;
        return settings.getConfigValue(variable);
    }
}

