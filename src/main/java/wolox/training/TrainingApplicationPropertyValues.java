package wolox.training;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class TrainingApplicationPropertyValues {

    public String getPropValues() throws IOException {
        String result = "";
        InputStream inputStream = null;

        try {
            Properties prop = new Properties();
            String propFileName = "application.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException(
                    "property file '" + propFileName + "' not found in the classpath");
            }

            Date time = new Date(System.currentTimeMillis());
            String port = prop.getProperty("server.port");

            result = "Server Port = " + port;
            System.out.println(result + "\nProgram Ran on " + time);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return result;
    }
}
