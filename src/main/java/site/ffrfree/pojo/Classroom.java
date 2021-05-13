package site.ffrfree.pojo;

public class Classroom {
    private int classroomId;
    private String location;

    public Classroom() {
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroomId=" + classroomId +
                ", location='" + location + '\'' +
                '}';
    }

    public int getClassroomId() {
        return classroomId;
    }

    public String getLocation() {
        return location;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
