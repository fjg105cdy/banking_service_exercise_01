package com.yian.exercise_0301.services;


public interface EmailService {
    void sendEmail(
            String email,
            String username,
            String subject
    );
}
