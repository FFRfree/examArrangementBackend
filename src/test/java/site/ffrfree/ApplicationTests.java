package site.ffrfree;

import site.ffrfree.dao.ExamDao;
import site.ffrfree.service.ExamDetailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Time;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
    ExamDao examDao;

	@Autowired
    ExamDetailService examDetailService;

	@Test
	void test(){
		Time t1 = new Time(9,0,0);
		System.out.println(t1);

	}


}
