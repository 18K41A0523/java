package Assignments;

public class Hostel extends InheritDemo{
   String hstlname;
   int roomno;
public String getHstlname() {
	return hstlname;
}
public void setHstlname(String hstlname) {
	this.hstlname = "jaya";
}
public int getRoomno() {
	return roomno;
}
public void setRoomno(int roomno) {
	this.roomno = 22;
}
public void getDetails() {
	super.getDetails();
	System.out.println("Hostelname"+hstlname);
	System.out.println("Roomno"+roomno);
	
}
public static void main(String args[]) {
	Hostel obj=new Hostel();
}
}