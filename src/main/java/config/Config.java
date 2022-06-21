package config;

import java.io.InputStream;
import java.util.Properties;

public class Config {

    private Properties properties;
    protected static final String APPLICATION_URL = System.getProperty("application.url");

    public Config() {
        properties = getProperties();
    }

    private Properties getProperties() {
        Properties prop = new Properties();
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
            prop.load(inputStream);
        } catch (Exception e) {
            throw new RuntimeException("Cannot load properties file: " + e);
        }
        return prop;
    }

    public String getApplicationUrl() {
        if (APPLICATION_URL != null && !APPLICATION_URL.isEmpty()) {
            System.out.println("SRODOWISKO: Application url: " + APPLICATION_URL);
            return APPLICATION_URL;
        } else {
            String url = properties.getProperty("application.url");
            System.out.println("PROPERTIES: Application url: " + url);
            return url;
        }
    }

    public String getApplicationUser() {
        return properties.getProperty("application.user");
    }

    public String getApplicationPassword() {
        return properties.getProperty("application.password");
    }

    public String getApplicationTest() {
        return properties.getProperty("application.test");
    }

}