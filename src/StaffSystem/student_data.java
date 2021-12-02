package StaffSystem;


public class student_data implements Comparable<student_data>{
	 
    private String Course;
    private String Faculty;
    private int matricID;
     
    public student_data(String Course,String Faculty,int matricID){
        this.Course = Course;
        this.Faculty = Faculty;
        this.matricID = matricID;
    }
     
    public String getCourse() {
        return Course;
    }
    public void setCourse(String Course) {
        this.Course = Course;
    }
    public String getFaculty() {
        return Faculty;
    }
    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }
    public int getmatricID() {
        return matricID;
    }
 
    public void setmatricID(int matricID) {
        this.matricID = matricID;
    }
 
    public String toString(){
        return "Student: "+getmatricID()+", Course:"+getCourse()+" "+getFaculty();
    }
 
    public int compareTo(student_data o) {
        student_data e = (student_data)o;
        if(this.matricID > e.getmatricID())
            return 1;
        if(this.matricID < e.getmatricID())
            return -1;
        if(this.matricID == e.getmatricID())
            return 0;
        return 0;
    }
}
