package business;

import java.time.LocalDate;

public class Student {
    private int sutdentID;
    private String studentName;
    private LocalDate birstDate;

    public Student() {
    }

    public Student(int sutdentID, String studentName) {
        this.sutdentID = sutdentID;
        this.studentName = studentName;
    }

    public Student(int sutdentID, String studentName, LocalDate birstDate) {
        this.sutdentID = sutdentID;
        this.studentName = studentName;
        this.birstDate = birstDate;
    }

    public LocalDate getBirstDate() {
        return birstDate;
    }

    public void setBirstDate(LocalDate birstDate) {
        this.birstDate = birstDate;
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
