package cn.iq99;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,DataSourceTransactionManagerAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class PadbApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(PadbApplication.class, args);
	}

}
