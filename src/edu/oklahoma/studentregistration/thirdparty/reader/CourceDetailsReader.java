/**
 * 
 */
package edu.oklahoma.studentregistration.thirdparty.reader;

/**
 * @author Gautham
 *
 */
public class CourceDetailsReader implements Reader{
	
	CourseDetails courseDetails;

	@Override
	public void registerReader() {
		// TODO Auto-generated method stub
	}
	
	public void setDetails(Details details){
		this.courseDetails = (CourseDetails)details;
	}

}
