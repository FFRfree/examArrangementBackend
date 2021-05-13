package site.ffrfree.dto;

import site.ffrfree.pojo.WeekDay;

import java.sql.Time;

public class ExamDto {
    private String courseName;
    private String teacherName;
    private String location;
    private int timeId;
    private Time startTime;
    private int weekId;
    private WeekDay weekDay;
    private String inviligation;

    public String getInviligation() {
        return inviligation;
    }

    public void setInviligation(String inviligation) {
        this.inviligation = inviligation;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public int getWeekId() {
        return weekId;
    }

    public void setWeekId(int weekId) {
        this.weekId = weekId;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public ExamDto() {
    }

}
