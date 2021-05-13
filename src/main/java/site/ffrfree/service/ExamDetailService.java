package site.ffrfree.service;

import site.ffrfree.dao.ExamDao;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.ffrfree.pojo.*;

import java.sql.Time;
import java.util.List;

@Service
public class ExamDetailService {
    private static final Log log = LogFactory.getLog(ExamDetailService.class);
    @Autowired
    ExamDao examDao;

    public List<ExamDetail> getAllExam() {
        return examDao.getAll();
    }

    public boolean addExam(String cname, String tname, String roomLocation, int timeId, int week,String inviligation){
        Course course = examDao.lookupCourse(cname, tname);
        Classroom classroom = examDao.lookupClassroom(roomLocation);
        Teacher teacher = examDao.lookupTeacher(inviligation);
        System.out.println(course);
        System.out.println(classroom);
        System.out.println(teacher);
        if(course == null || classroom ==null || teacher==null)
            return false;
        examDao.addExam(course.getCourseId(),classroom.getClassroomId(),timeId,week, teacher.getTeacherId());
        return true;
    }

    public List<ExamDetail> getOneStudentExam(String name){
        return examDao.getOneStudentExam(name);
    }

    public int deleteOneExam(String roomlocation, Time starttime, WeekDay weekDay, int week){
        return examDao.deleteExam(roomlocation,starttime.toString(),weekDay.toString(),week);
    }

    public List<ExamDetail> getOneTeacherExam(String tname){
        return examDao.getOneTeacherExam(tname);
    }

}
