package indi.chester.mybatis.entity;

public class Student {
    private Integer studentId;
    private String studentName;
    private Integer classroomId;
    private Classroom classroom;

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public  String getStudentName() {
        return studentName;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setStudentName( String studentName) {
        this.studentName = studentName;
    }

}
