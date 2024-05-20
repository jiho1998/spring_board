package com.ohgiraffers.spring_board.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ohgiraffers.spring_board")
@MapperScan(basePackages = "com.ohgiraffers.spring_board", annotationClass = Mapper.class)
public class Confi {
}
