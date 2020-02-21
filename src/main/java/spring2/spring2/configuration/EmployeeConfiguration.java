package spring2.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring2.spring2.entites.*;

@Configuration
@ComponentScan("spring2.spring2")
@PropertySource("classpath:climber.properties")
public class EmployeeConfiguration {

    @Bean
    public Session climbingSession(){
        return new ClimbingSession();
    }

    @Bean
    public Sport climber(){
        return new Climber(climbingSession(), "Enosh", 119);
    }


    @Bean
    public Session runningSession(){
        return new RunningSession();
    }

    @Bean
    public Sport runner(){
        return new Runner("Yohav", 28, runningSession());
    }
}
