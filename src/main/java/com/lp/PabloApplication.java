package com.lp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * 一个简单易上手的脚手架
 * @author lipeng 329547389@qq.com
 * 2020/8/4
 */
@SpringBootApplication
public class PabloApplication {
	public static void main(String[] args) {
		SpringApplication.run(PabloApplication.class, args);
	}
}
