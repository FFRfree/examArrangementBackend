package site.ffrfree.pojo;

public class Exam {
    private int courseId;
    private int classroomId;
    private int teacherId;
    private int timeSliceId;
    private int weeksId;

    public Exam() {
    }

    public int getCourseId() {
        return courseId;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public int getTimeSliceId() {
        return timeSliceId;
    }

    public int getWeeksId() {
        return weeksId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setTimeSliceId(int timeSliceId) {
        this.timeSliceId = timeSliceId;
    }

    public void setWeeksId(int weeksId) {
        this.weeksId = weeksId;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "courseId=" + courseId +
                ", classroomId=" + classroomId +
                ", teacherId=" + teacherId +
                ", timeSliceId=" + timeSliceId +
                ", weeksId=" + weeksId +
                '}';
    }
}
