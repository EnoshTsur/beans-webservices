package spring2.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring2.spring2.configuration.EmployeeConfiguration;
import spring2.spring2.entites.Climber;
import spring2.spring2.entites.Runner;
import spring2.spring2.entites.Sport;

@SpringBootApplication
public class Spring2Application {

    public static void main(String[] args) {

        SpringApplication.run(Spring2Application.class, args);

        ApplicationContext context
                = new AnnotationConfigApplicationContext(
                        EmployeeConfiguration.class
        );

//        Sport runner = context.getBean("runner", Runner.class);
//        System.out.println(runner);
//        System.out.println(runner.getSessionContext());

        Climber climber = context.getBean("climber", Climber.class);
        System.out.println(climber);
        System.out.println(climber.getSessionContext());
        System.out.println(climber.getType());

    }

}
