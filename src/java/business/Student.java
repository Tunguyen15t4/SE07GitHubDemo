package business;
public class Student {
    private int sutdentID;
    private String studentName;

    public Student(int sutdentID, String studentName) {
        this.sutdentID = sutdentID;
        this.studentName = studentName;
    }

    public int getSutdentID() {
        return sutdentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setSutdentID(int sutdentID) {
        this.sutdentID = sutdentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
