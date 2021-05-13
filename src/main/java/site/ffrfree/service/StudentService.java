package site.ffrfree.service;

import site.ffrfree.dao.StudentDao;
import site.ffrfree.pojo.Gender;
import site.ffrfree.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public List<Student> getAllStudent(){
        return studentDao.getAll();
    }
    public int registerStudent(String name, Gender gender, int facultyId){
        return studentDao.insertStudent(name,gender,facultyId);
    }
    public boolean logoutStudent(String name, String faculty){
        studentDao.deleteStudent(name,faculty);
        return true;
    }
}
