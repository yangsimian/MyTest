package com.itheima.mybatis;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication// 代表为SpringBoot应用的运行主类
// 指定扫描的基础包 
public class Application {
	
	public static void main(String[] args) {
		//运行SpringBoot应用 (方式一)不能取消banner
		//SpringApplication.run(Application.class, args);
		
		//方式二
		SpringApplication sa = new SpringApplication(Application.class);
		//取消baanner
		sa.setBannerMode(Mode.OFF);
		//运行
		sa.run(args);
	}
	
}
