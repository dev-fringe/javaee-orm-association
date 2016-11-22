package dev.fringe;

import dev.fringe.service.ContactService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import javax.inject.Inject;
import java.io.IOException;

@Configuration
@ComponentScan
@ImportResource(value =  {"app-datasource.xml","app-hibernate.xml"})
public class Application {

    @Inject ContactService contactService;

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Application.class).getBean(Application.class).run();
    }

    private void run() {
        System.out.println(contactService.list());
    }
}
