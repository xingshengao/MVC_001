package com.nju.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 创建springMVC的配置文件, 加载对应的bean
@Configuration
@ComponentScan("com.nju.controller")
public class SpringMvcConfig {
}
