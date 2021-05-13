package site.ffrfree.pojo;

import java.sql.Time;

public class CurriculumnDetail {
    private int courseId;
    private String name;
    private String classroomLocation;
    private Time startTime;
    private Time endTime;
    private WeekDay weekDay;

    public CurriculumnDetail() {
    }

    public CurriculumnDetail(int courseId, String name, String classroomLocation, Time startTime, Time endTime, WeekDay weekDay) {
        this.courseId = courseId;
        this.name = name;
        this.classroomLocation = classroomLocation;
        this.startTime = startTime;
        this.endTime = endTime;
        this.weekDay = weekDay;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public String getClassroomLocation() {
        return classroomLocation;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassroomLocation(String classroomLocation) {
        this.classroomLocation = classroomLocation;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }
}
