package site.ffrfree.dao;

import site.ffrfree.pojo.Gender;
import site.ffrfree.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import java.util.List;

public interface StudentDao {
    @Select("SELECT * FROM basic_info.student;")
    public List<Student> getAll();

    @Insert("INSERT INTO basic_info.student " +
            "VALUES (DEFAULT, #{name}, #{gender},#{faculty_id});")
    public int insertStudent(@Param("name") String name, @Param("gender") Gender gender, @Param("faculty_id") int facultyId);

    @Select(value="{call basic_info.logout_student(#{name,mode=IN}, #{faculty,mode=IN})}")
    @Options(statementType = StatementType.CALLABLE)
    public void deleteStudent(@Param("name") String name, @Param("faculty") String faculty);

}
