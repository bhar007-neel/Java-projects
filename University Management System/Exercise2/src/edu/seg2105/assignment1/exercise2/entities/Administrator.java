package edu.seg2105.assignment1.exercise2.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * The Administrator class represents an administrative employee with specific tasks.
 * Extends the Employee class.
 * 
 * @autor Hussein Al Osman
 */
public class Administrator extends Employee{

	// List of tasks assigned to the administrator
	List<String> tasks;

	/**
	 * Constructs a new Administrator with the given details.
	 * 
	 * @param firstName the first name of the administrator
	 * @param lastName the last name of the administrator
	 * @param id the ID of the administrator
	 * @param salary the salary of the administrator
	 */
	public Administrator(String firstName, String lastName, String id, double salary) {
		super(firstName, lastName, id, salary);
		tasks = new ArrayList<String>();
	}

	/**
	 *
	 * @param task adds task to the list of tasks
	 */

	public void addTask(String task){

			tasks.add(task);
	}

	/**
	 *
	 * @return tasklist with all the tasks given to the administrator
	 */

	private String getTasksList(){
		String TaskList="";
		for (String task:tasks){
			TaskList= TaskList + task +  "\n";


		}
		return TaskList;


	}

	public String toString(){
		return "Administration information:\n"
				+ "\tFirst name: " + getFirstName() + "\n"
				+ "\tLast name: " + getLastName() + "\n"
				+ "\tid: " + getId() + "\n"
		        + "\tSalary: " + getSalary() + "\n"
				+ "\tTasks: " + getTasksList() + "\n";
	}

}
