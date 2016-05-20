/**
 * 
 */
package edu.oklahoma.studentregistration.process;

import edu.oklahoma.studentregistartion.Faculty;
import edu.oklahoma.studentregistartion.Student;

/**
 * @author Gautham
 *
 */
public class Schedule {
	
	private Student student;
	
	private Course course;
	
	private Term semester;
	
	private Faculty faculty;

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * @return the cource
	 */
	public Course getCource() {
		return course;
	}

	/**
	 * @param cource the cource to set
	 */
	public void setCource(Course cource) {
		this.course = cource;
	}

	/**
	 * @return the semester
	 */
	public Term getSemester() {
		return semester;
	}

	/**
	 * @param semester the semester to set
	 */
	public void setSemester(Term semester) {
		this.semester = semester;
	}

	/**
	 * @return the faclty
	 */
	public Faculty getFaclty() {
		return faculty;
	}

	/**
	 * @param faclty the faclty to set
	 */
	public void setFaclty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	

}
