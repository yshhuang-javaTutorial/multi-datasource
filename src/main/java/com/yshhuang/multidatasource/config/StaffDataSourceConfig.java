/**
* @author yshhuang@foxmail.com
* @date 3/16/2021
*/
package com.yshhuang.multidatasource.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.yshhuang.multidatasource.mapper.staff", sqlSessionFactoryRef = "staffSqlSessionFactory")
public class StaffDataSourceConfig {

    @Bean(name = "staffDataSource")
    @ConfigurationProperties("spring.datasource.staff")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "staffSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("staffDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }
}
