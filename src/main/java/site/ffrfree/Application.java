package site.ffrfree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@MapperScan("site.ffrfree.dao")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
