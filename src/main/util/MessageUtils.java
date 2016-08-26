package main.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Andrea Zago on 24/08/2016.
 */
public class MessageUtils {

    private static String language = System.getProperty( "user.language" );
    private static String country = System.getProperty( "user.country" );

    public static void init(String language, String country) {
        MessageUtils.language = language;
        MessageUtils.country = country;
    }

    static public String getLocalizedString(String key){
        Locale currentLocale;
        currentLocale = new Locale( language, country );
        return ResourceBundle.getBundle( "MessagesBundle", currentLocale ).getString( key );
    }
}
