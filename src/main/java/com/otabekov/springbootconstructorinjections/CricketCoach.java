package com.otabekov.springbootconstructorinjections;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling 15 minutes!!";
    }
}
