package com.example.demo;
import com.example.demo.beans.MyBean;
import com.example.demo.beans.SecondName;
import com.example.demo.config.AppConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		MyBean bean = context.getBean(MyBean.class);
		System.out.println(bean.sayHello());

		bean.setName(new SecondName());
		System.out.println(bean.sayHello());
	}
}