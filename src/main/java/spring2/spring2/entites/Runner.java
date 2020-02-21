package spring2.spring2.entites;

import org.springframework.beans.factory.annotation.Autowired;

public class Runner implements Sport {

    private String name;
    private int age;
    private Session session;


    @Autowired
    public Runner(String name, int age, Session session) {
        this.name = name;
        this.age = age;
        this.session = session;
    }

    @Override
    public String getType() {
        return "Running";
    }

    @Override
    public String getSessionContext() {
        return session.getContext();
    }

    @Override
    public String toString() {
        return "Runner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", session=" + session +
                '}';
    }
}
