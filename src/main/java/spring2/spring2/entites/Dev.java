package spring2.spring2.entites;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Dev implements Employee {


    private final MeetingService meetingService;


    @Autowired
    public Dev(@Qualifier("devMeetingService") MeetingService meetingService) {
        this.meetingService = meetingService;
    }


    public String getMeetingContext() {
        return meetingService.getMeetingContext();
    }

    @Override
    public int getSalary() {
        return 16000;
    }
}
