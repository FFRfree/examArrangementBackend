package site.ffrfree.controller;


import site.ffrfree.dto.ExamDto;
import site.ffrfree.pojo.ExamDetail;
import site.ffrfree.service.ExamDetailService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exam")
public class ExamDetailController {
    private static final Log log = LogFactory.getLog(ExamDetailController.class);

    @Autowired
    ExamDetailService examDetailService;

    @GetMapping
    public List<ExamDetail> getAll(){
        if(log.isTraceEnabled()){
            log.trace("getAll(); 被调用");
        }
        List<ExamDetail> list = examDetailService.getAllExam();
        if(log.isTraceEnabled()){
            log.trace("查询得到 "+ list.size() + " 条记录.");
        }
        return list;
    }

    @PostMapping("/add")
    public boolean insertOneExam(@RequestBody(required = false)ExamDto examDto){
        if(log.isTraceEnabled()){
            log.trace("传递进来的参数是："+ examDto);
        }
        return examDetailService.addExam(examDto.getCourseName(),examDto.getTeacherName(),examDto.getLocation(),examDto.getTimeId(),examDto.getWeekId(),examDto.getInviligation());
    }

    @PostMapping("/delete")
    public int deleteOneExam(@RequestBody(required = false) ExamDto examDto){
        if(log.isTraceEnabled()){
            log.trace("传递进来的参数是："+ examDto);
        }
        return examDetailService.deleteOneExam(examDto.getLocation(),examDto.getStartTime(),examDto.getWeekDay(),examDto.getWeekId());
    }

    @GetMapping("/s/{name}")
    public List<ExamDetail> getOneStudentExam(@PathVariable String name){
        if(log.isTraceEnabled()){
            log.trace("get "+name+ "'s exam! ");
        }
        return examDetailService.getOneStudentExam(name);
    }

    @GetMapping("/t/{name}")
    public List<ExamDetail> getOneTeacherExam(@PathVariable String name){
        if(log.isTraceEnabled()){
            log.trace("get "+name+ "'s exam! ");
        }
        return examDetailService.getOneTeacherExam(name);
    }

}
