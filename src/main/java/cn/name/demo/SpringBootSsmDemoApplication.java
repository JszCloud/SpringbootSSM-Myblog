package cn.name.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@MapperScan("cn.name.demo.mapper")//主要作用是扫描包
public class SpringBootSsmDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSsmDemoApplication.class, args);
	}
}
