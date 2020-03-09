package wolox.training;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(TrainingApplication.class, args);
        TrainingApplicationPropertyValues properties = new TrainingApplicationPropertyValues();
        properties.getPropValues();
    }

}
