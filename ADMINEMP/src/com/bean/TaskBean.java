package com.bean;

public class TaskBean {
int taskid;
int empid;
String task;
String status;
public int getTaskid() {
	return taskid;
}
public void setTaskid(int taskid) {
	this.taskid = taskid;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getTask() {
	return task;
}
public void setTask(String task) {
	this.task = task;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}
