package spring2.spring2.entites;

import org.springframework.stereotype.Component;

@Component
public class DevMeetingService implements MeetingService {

    @Override
    public String getMeetingContext() {
        return "Playing ping pong";
    }
}
