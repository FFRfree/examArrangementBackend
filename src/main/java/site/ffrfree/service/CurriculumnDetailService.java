package site.ffrfree.service;

import site.ffrfree.dao.CurriculumnDetailDao;
import site.ffrfree.pojo.CurriculumnDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculumnDetailService {

    @Autowired
    CurriculumnDetailDao curriculumnDetailDao;

    public List<CurriculumnDetail> getAllCurriculumn(){
        return curriculumnDetailDao.getAll();
    }
}
