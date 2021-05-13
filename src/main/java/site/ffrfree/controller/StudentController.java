package site.ffrfree.controller;

import site.ffrfree.dto.StudentDto;
import site.ffrfree.pojo.Student;
import site.ffrfree.service.StudentService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private static final Log log = LogFactory.getLog(StudentController.class);

    @Autowired
    StudentService studentService;


    @GetMapping
    public List<Student> getAll(){
        if(log.isTraceEnabled()){
            log.trace("getAll(); 被调用");
        }
        List<Student> list = studentService.getAllStudent();
        if(log.isTraceEnabled()){
            log.trace("查询得到 "+ list.size() + " 条记录.");
        }
        return list;
    }

    @PostMapping
    public boolean studentCRUD(@RequestBody(required = false) StudentDto studentDto){
        if(log.isTraceEnabled()){
            log.trace("传递进来的参数是："+ studentDto);
        }
        switch (studentDto.getOperation()){
            case 1: //register a student
                studentService.registerStudent(studentDto.getName(),studentDto.getGender(),studentDto.getFacultyId());
                return true;
            case 2: //logout a student
                studentService.logoutStudent(studentDto.getName(),studentDto.getFacultyName());
                return true;
            default:
                log.warn("匹配操作失败");
                return false;
        }
    };

}
