package site.ffrfree.controller;

import site.ffrfree.pojo.CurriculumnDetail;
import site.ffrfree.service.CurriculumnDetailService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/curriculumndetail")
public class CurriculumnDetailController {
    private static final Log log = LogFactory.getLog(CurriculumnDetailController.class);

    @Autowired
    CurriculumnDetailService curriculumnDetailService;

    @GetMapping
    public List<CurriculumnDetail> getAll(){
        if(log.isTraceEnabled()){
            log.trace("getAll(); 被调用");
        }
        List<CurriculumnDetail> list = curriculumnDetailService.getAllCurriculumn();
        if(log.isTraceEnabled()){
            log.trace("查询获得 "+ list.size() + " 条记录.");
        }
        return list;
    }


}
