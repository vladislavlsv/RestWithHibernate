package HibProj;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Пользователь on 16.11.2016.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args)  {
        SpringApplication.run(Application.class, args);
    }
    public void run(String... strings) throws Exception {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Spring-Module.xml");

    }
}
