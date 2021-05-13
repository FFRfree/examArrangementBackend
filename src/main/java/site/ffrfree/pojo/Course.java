package site.ffrfree.pojo;

public class Course {
    private int courseId;
    private int cname;
    private int teacherId;
    private String tname;

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Course() {
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCname(int cname) {
        this.cname = cname;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getCname() {
        return cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_id=" + courseId +
                ", cname=" + cname +
                ", teacher_id=" + teacherId +
                ", tname='" + tname + '\'' +
                '}';
    }
}
