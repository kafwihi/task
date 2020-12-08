package com.example.task.jobs;

public class jobNotFoundException extends Exception {
        private String jobname;
        public jobNotFoundException(String jobname) {

                super(String.format("Job is not found with id : '%s'", jobname));
                }
        }