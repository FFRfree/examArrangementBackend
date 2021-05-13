package site.ffrfree.pojo;

import java.sql.Time;

public class ExamDetail {
//    private int examId;
    private String courseName;
    private String teacherName;
    private String location;
    private Time startTime;
    private Time endTime;
    private int weeksId;
    private WeekDay weekDay;
    private int courseId;
    private String invigilationTeacher;

    public String getInvigilationTeacher() {
        return invigilationTeacher;
    }

    public void setInvigilationTeacher(String invigilationTeacher) {
        this.invigilationTeacher = invigilationTeacher;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ExamDetail() {
    }

    public int getWeeksId() {
        return weeksId;
    }

    public void setWeeksId(int weeksId) {
        this.weeksId = weeksId;
    }

    @Override
    public String toString() {
        return "ExamDetail{" +
                "courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", location='" + location + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", weeksId=" + weeksId +
                ", weekDay=" + weekDay +
                ", courseId=" + courseId +
                '}';
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getLocation() {
        return location;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }
}
