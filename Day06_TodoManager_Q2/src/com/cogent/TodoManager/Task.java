/**
 * 
 */
package com.cogent.TodoManager;

/**
 * @author : Edward Lam
 * @date   : 2023-01-17
 */
public class Task {
	/**
	 * @return the taskID
	 */
	public int getTaskID() {
		return taskID;
	}
	/**
	 * @param taskID the taskID to set
	 */
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return TaskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
	int taskID;
	String TaskName;
}
