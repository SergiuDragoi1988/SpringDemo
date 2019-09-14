package com.example.demo.config;

import com.example.demo.beans.FirstName;
import com.example.demo.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.beans")
public class AppConfig {
    //@Bean
//    public MyBean myBean(){
//        MyBean bean = new MyBean(new FirstName());
//        return bean;
//    }
}
