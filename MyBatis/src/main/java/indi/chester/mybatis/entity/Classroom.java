package indi.chester.mybatis.entity;

import java.util.List;

public class Classroom {
    private Integer tClassPk;
    private Integer studentId;
    private Integer classroomId;
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Integer gettClassPk() {
        return tClassPk;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void settClassPk(Integer tClassPk) {
        this.tClassPk = tClassPk;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }
}
