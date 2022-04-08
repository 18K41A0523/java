package asssignss;

public class Student {
        protected int studentId;
        protected String studentType;
        protected String studentName;
        public void setStudentType(String sType) {
        	this.studentType=sType;
        }
        public void setStudentName(String sName) {
        	this.studentName=sName;
        }
        public void getDetails() {
        	System.out.println("Student Id:"+studentId);
        	System.out.println("Student Type:"+studentType);
        }
}

