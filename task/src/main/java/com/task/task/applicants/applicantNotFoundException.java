package com.example.task.applicants;

public class applicantNotFoundException extends Exception {
        private String username;
        public applicantNotFoundException(String username) {

                super(String.format("Applicant is not found with id : '%s'", username));
                }
        }