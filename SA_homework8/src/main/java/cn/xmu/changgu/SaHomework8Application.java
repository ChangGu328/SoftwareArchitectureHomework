package cn.xmu.changgu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SaHomework8Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SaHomework8Application.class, args);
        Client client= context.getBean(Client.class);
        client.execute();
    }

}
