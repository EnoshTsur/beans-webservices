package spring2.spring2.entites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class Climber implements Sport {

    private Session session;
    private String name;
    private int age;

    @Value("${climber.skill}")
    private String skill;

    @Value("${climber.email}")
    private String email;

    @Autowired
    public Climber(Session session, String name, int age) {
        this.session = session;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getType() {
        return "Climbing";
    }

    @Override
    public String getSessionContext() {
        return session.getContext();
    }

    @Override
    public String toString() {
        return "Climber{" +
                "session=" + session +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", skill='" + skill + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
