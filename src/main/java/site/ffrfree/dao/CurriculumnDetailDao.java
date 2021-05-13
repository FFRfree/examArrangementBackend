package site.ffrfree.dao;

import site.ffrfree.pojo.CurriculumnDetail;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CurriculumnDetailDao {
    @Select("SELECT * FROM basic_info.curriculumn_detail;")
    public List<CurriculumnDetail> getAll();


}
