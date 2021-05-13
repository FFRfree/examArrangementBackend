package site.ffrfree.dto;

import site.ffrfree.pojo.Gender;

public class StudentDto {
    private int operation; //1->增加, 2->删除

    private int studentId;
    private String name;
    private Gender gender;
    private int facultyId;
    private String facultyName;

    public StudentDto() {
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getOperation() {
        return operation;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }
}
