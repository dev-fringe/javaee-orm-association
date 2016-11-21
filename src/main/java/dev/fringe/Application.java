package dev.fringe;

import dev.fringe.service.ContactService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import java.io.IOException;

@Configuration
@ComponentScan
@ImportResource(value =  {"app-datasource.xml","app-hibernate.xml"})
public class Application {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        ContactService contactService = context.getBean(ContactService.class);
        System.out.println(contactService.list());

    }
}
