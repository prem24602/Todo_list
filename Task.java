package com.example.demo;

import java.time.LocalDate;

public class Task {
    static int mygenerator = 0;
    String status;
    String deadline;
    int TaskId;

//    public Task(String status, String deadline) {
//        this.status = status;
//        this.deadline = deadline;
//        this.TaskId = mygenerator++;
//    }
    
//    public int getDelId() {
//    	return TaskId;
//    }
//    public void setDelId(int id) {
//    	this.TaskId = mygenerator++;
//    }
    public int getTaskId() {
        return TaskId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return status + "/" + deadline + "/" + TaskId;
    }
    public void setTaskId() {
    	
    	mygenerator++;
    	this.TaskId = mygenerator;
    }



	

	




}
