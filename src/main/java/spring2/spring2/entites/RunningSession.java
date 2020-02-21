package spring2.spring2.entites;

public class RunningSession implements Session {
    @Override
    public String getContext() {
        return "With my headphones!";
    }
}
