/**
 * 
 */
package edu.oklahoma.studentregistration.thirdparty.reader;

/**
 * @author Gautham
 *
 */
public class StudentDetailsReader implements Reader{
	
	StudentDetails studentDetails;

	/* (non-Javadoc)
	 * @see edu.oklahoma.studentregistration.thirdparty.reader.Reader#registerReader()
	 */
	@Override
	public void registerReader() {
		// TODO Auto-generated method stub
		
	}
	
	public void setStudentDetails(Details details){
		this.studentDetails = (StudentDetails)details;
	}
	

}
