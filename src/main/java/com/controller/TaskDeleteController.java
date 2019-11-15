package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.model.TaskRegistration;

@Controller
public class TaskDeleteController {
	@RequestMapping(method = RequestMethod.DELETE, value="/tasks/{id}")
	@ResponseBody
	public String deleteTaskRecord(@PathVariable("id") int id) {
		System.out.println("DELETE: deleting task");
	    return TaskRegistration.getInstance().deleteTask(id);
	}
}
