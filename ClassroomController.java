package com.virtualclassroom.controller;

import com.virtualclassroom.model.Meeting;
import com.virtualclassroom.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meetings")
public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;

    @GetMapping
    public List<Meeting> getAllMeetings() {
        return classroomService.getAllMeetings();
    }

    @PostMapping
    public Meeting createMeeting(@RequestBody Meeting meeting) {
        return classroomService.createMeeting(meeting);
    }
}
