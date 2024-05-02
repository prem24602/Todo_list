package com.example.demo;

import java.util.ArrayList;


public class Taskmanager {
//	private static final int TaskId = 1;
	ArrayList<Task> storage = new ArrayList<>();

	public ArrayList<Task> getall() {

		return storage;
	}

	public void addtask(Task single) {
		storage.add(single);
	}

	public Task getTask(int id) {
		for(Task newtask: storage) {
			if(newtask.getTaskId() == id) {
				return newtask;
			}
		}
		return null;
	}
	public String deltask(int id) {
		
		for(Task deltask: storage)
			if(deltask.getTaskId() == id) {
			storage.remove(deltask);
			return "{\"Task is deleted\"}";
		} 
		
		return "{\"Task is Invalid\"}";
	}
	public Task updatetask(int id,Task edittask) {
		for(Task puttask: storage) {
			if(puttask.getTaskId() == id) {
				puttask.setStatus(edittask.getStatus());
				return puttask;
			}
		}
		return null;
	}






	

	

}
