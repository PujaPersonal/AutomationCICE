
//*** The ConfigReader class reads the environment variables from the .env file.***//

package utils;

import io.github.cdimascio.dotenv.Dotenv;

public class ConfigReader {

    private static final Dotenv dotenv = Dotenv.load();

    public static String getUsername(){

        return dotenv.get("USERNAME");
    }

    public static String getPassword() {
        return dotenv.get("PASSWORD");
    }

    public static String getURL() {
        return dotenv.get("URL");
    }
}
