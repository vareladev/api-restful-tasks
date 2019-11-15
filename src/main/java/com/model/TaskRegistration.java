package com.model;

import java.util.ArrayList;
import java.util.List;

public class TaskRegistration {
    private List<Task> taskRecords;
    private static TaskRegistration tskregd = null;
    
    //constructor
    private TaskRegistration(){
    	taskRecords = new ArrayList<Task>();
    }
    
    //methods
    public static TaskRegistration getInstance() {
        if(tskregd == null) {
        	tskregd = new TaskRegistration();
        	return tskregd;
        }
        else {
            return tskregd;
        }
    }
    
    public void add(Task t) {
    	taskRecords.add(t);
    }
    
    //update method
	public String updateTask(Task t, int id) {
		for(int i=0; i<taskRecords.size(); i++){
            Task taskAux = taskRecords.get(i);
            if(taskAux.getId() == id) {
            	taskRecords.set(i, t);//update the new record
              return "Actualización exitosa";
            }
        }
		return "Error: no se encontró el registro";
	}
	
	//delete method
	public String deleteTask(int id) {
		for(int i=0; i<taskRecords.size(); i++){
			Task taskAux = taskRecords.get(i);
            if(taskAux.getId() == id){
            	taskRecords.remove(i);
            	return "Eliminación exitosa";
            }
        }
		return "Error: no se encontró el registro";
	}
	
	
	public List<Task> getTaskRecords() {
	    return taskRecords;
	}
	
	public Task getTask(int id) {
		Task task = null;
		for(int i=0; i<taskRecords.size(); i++){
			Task taskAux = taskRecords.get(i);
            if(taskAux.getId() == id){
            	task = taskAux;
            	break;
            }
        }	
		return task;
	}
}
