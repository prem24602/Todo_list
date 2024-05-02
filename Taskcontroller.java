package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class Taskcontroller {
	
	Taskmanager task = new Taskmanager();
	@GetMapping("/viewtask")
	public ArrayList<Task> getall() {
		return task.getall();		
	}
	@PostMapping("/addtask")
	public void posttask(@RequestBody Task single) {
		single.setTaskId();
		//single.getTaskId();
		task.addtask(single);	
	}
	@GetMapping("/viewtask/{id}")
	public Task GettaskbyId(@PathVariable int id) {
		return task.getTask(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deltaskbyId(@PathVariable int id) {
		return task.deltask(id);
	}
	@PutMapping("/update/{id}")
	public Task edittaskbyId(@PathVariable int id,@RequestBody Task edittask) {
		return task.updatetask(id,edittask);
	}
	
}
