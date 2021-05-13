package site.ffrfree.dao;


import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import site.ffrfree.pojo.Classroom;
import site.ffrfree.pojo.Course;
import site.ffrfree.pojo.ExamDetail;
import site.ffrfree.pojo.Teacher;

import java.util.List;

public interface ExamDao {
    @Select("SELECT * FROM basic_info.exam_detail;")
    public List<ExamDetail> getAll();

    @Select("SELECT teacher_id, course_id " +
            "FROM basic_info.course " +
            "JOIN basic_info.curriculum USING(curriculum_id) " +
            "JOIN basic_info.teacher USING (teacher_id) " +
            "WHERE curriculum.name = #{cname} and teacher.name = #{tname};")
    public Course lookupCourse(@Param("cname") String cname, @Param("tname") String tname);

    @Select("SELECT classroom_id FROM basic_info.classroom WHERE location = #{location};")
    public Classroom lookupClassroom(@Param("location") String location);

    @Select("SELECT teacher_id FROM basic_info.teacher " +
            "WHERE name = #{tname};")
    public Teacher lookupTeacher(@Param("tname") String tname);


    @Insert("INSERT INTO basic_info.exam " +
            "VALUES (#{courseid},#{roomid},#{timeid},#{weekid},#{invigilation});")
    public int addExam(@Param("courseid") int courseid, @Param("roomid") int roomid, @Param("timeid") int timeid, @Param("weekid") int weekid,@Param("invigilation") int invigilation);

    @Select(value = "call basic_info.find_exam_by_student(#{name});")
    @Options(statementType = StatementType.CALLABLE)
    public List<ExamDetail> getOneStudentExam(@Param("name") String name);

    @Delete("DELETE FROM basic_info.exam WHERE " +
            "classroom_id = (SELECT classroom_id FROM basic_info.classroom WHERE location = #{roomlocation})   " +
            "            AND  " +
            "            time_slice_id = (SELECT time_slice_id FROM basic_info.time_slice_weekly WHERE start_time = #{starttime} and week_day = #{weekday})  " +
            "            AND  " +
            "            weeks_id = (SELECT id FROM basic_info.weeks WHERE id = #{weekid}); ")
    public int deleteExam(@Param("roomlocation") String roomlocation, @Param("starttime")String starttime, @Param("weekday")String weekDay, @Param("weekid") int weekid);


    @Select("SELECT * FROM basic_info.exam_detail " +
            "WHERE invigilation_teacher = #{tname};")
    public List<ExamDetail> getOneTeacherExam(@Param("tname") String tname);
}
