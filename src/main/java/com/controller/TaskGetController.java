package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Task;
import com.model.TaskRegistration;

@Controller
public class TaskGetController {
	@RequestMapping(method = RequestMethod.GET, value="/tasks")
	@ResponseBody
	public List<Task> getAllTaks() {
		return TaskRegistration.getInstance().getTaskRecords();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/tasks/{id}")
	@ResponseBody
	public Task getTask(@PathVariable("id") int id) {
		return TaskRegistration.getInstance().getTask(id);
	}
}
