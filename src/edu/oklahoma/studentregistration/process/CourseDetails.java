/**
 * 
 */
package edu.oklahoma.studentregistration.process;

import edu.oklahoma.studentregistartion.Faculty;
import edu.oklahoma.studentregistration.process.Term;

/**
 * @author Gautham
 *
 */
public class CourseDetails {
	
	String courseId;
	
	String courceName;
	
	Term semester;
	
	Faculty faculty;

	/**
	 * @return the courseId
	 */
	public String getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	/**
	 * @return the courceName
	 */
	public String getCourceName() {
		return courceName;
	}

	/**
	 * @param courceName the courceName to set
	 */
	public void setCourceName(String courceName) {
		this.courceName = courceName;
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
	 * @return the faculty
	 */
	public Faculty getFaculty() {
		return faculty;
	}

	/**
	 * @param faculty the faculty to set
	 */
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	

}
