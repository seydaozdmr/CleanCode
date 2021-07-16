package Principles.CostumerService.Util;

import java.util.Properties;

public class ATMProperties {
    private static Properties properties;

    public static Properties getProperties() {
        return properties;
    }

    public static void setProperties(Properties properties) {
        ATMProperties.properties = properties;
    }

    public static String getProperty(String name){
        return properties.getProperty(name);
    }

    public static void setProperty(String name,String property){
        properties.setProperty(name,property);
    }

}
