package com.virtualclassroom.service;

import com.virtualclassroom.model.Meeting;
import com.virtualclassroom.repository.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {

    @Autowired
    private MeetingRepository meetingRepository;

    public List<Meeting> getAllMeetings() {
        return meetingRepository.findAll();
    }

    public Meeting createMeeting(Meeting meeting) {
        return meetingRepository.save(meeting);
    }
}
