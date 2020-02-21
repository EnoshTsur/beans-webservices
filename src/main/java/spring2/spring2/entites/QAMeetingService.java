package spring2.spring2.entites;

import org.springframework.stereotype.Component;

@Component
public class QAMeetingService implements MeetingService {

    @Override
    public String getMeetingContext() {
        return "Destroy some dev lifes";
    }
}
