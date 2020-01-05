package com.leyou.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
//public class JdbcConfig {
//
//        @Bean
//        public DataSource dataSource(JdbcProperties jdbc) {
//            DruidDataSource dataSource = new DruidDataSource();
//            dataSource.setUrl(jdbc.getUrl());
//            dataSource.setDriverClassName(jdbc.getDiverClassName());
//            dataSource.setUsername(jdbc.getUsername());
//            dataSource.setPassword(jdbc.getPassword());
//            return dataSource;
//        }
//}
@Configuration
public class JdbcConfig {

//    @Bean
//    // 声明要注入的属性前缀，SpringBoot会自动把相关属性通过set方法注入到DataSource中
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        return dataSource;
//    }
}
