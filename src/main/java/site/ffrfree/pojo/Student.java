package site.ffrfree.pojo;

public class Student {
    private int studentId;
    private String name;
    private Gender gender;
    private int facultyId;

    public Student() {
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + studentId +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", faculty='" + facultyId + '\'' +
                '}';
    }
}
