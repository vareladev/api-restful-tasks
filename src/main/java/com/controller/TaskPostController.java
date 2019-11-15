package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Task;
import com.model.TaskRegistration;
import com.model.TaskRegistrationReply;

@Controller
public class TaskPostController {
	
	@RequestMapping(method = RequestMethod.POST, value="/tasks")
	@ResponseBody
	public TaskRegistrationReply postTask(@RequestBody Task t) {
		System.out.println("POST: registering taks");
		TaskRegistrationReply taskreply = new TaskRegistrationReply();           
		TaskRegistration.getInstance().add(t);
		//We are setting the below value just to reply a message back to the caller
		taskreply.setId(t.getId());
		taskreply.setDescription(t.getDescription());
		taskreply.setStatus("Successful");
	    return taskreply;
	}
}
