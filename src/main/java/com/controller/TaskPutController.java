package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Task;
import com.model.TaskRegistration;
import com.model.TaskRegistrationReply;

@Controller
public class TaskPutController {
	@RequestMapping(method = RequestMethod.PUT, value="/tasks/{id}")
	@ResponseBody
	public TaskRegistrationReply putTask(@PathVariable("id") int id, @RequestBody Task t) {
		System.out.println("PUT: Updating task");  
		TaskRegistration.getInstance().updateTask(t, id);
		
		TaskRegistrationReply taskreply = new TaskRegistrationReply();   
		//We are setting the below value just to reply a message back to the caller
		taskreply.setId(t.getId());
		taskreply.setDescription(t.getDescription());
		taskreply.setStatus("Successful");
	    return taskreply;		
	}
}
