package com.kiran.contactapp.config;

import java.util.Properties;

import javax.inject.Inject;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.kiran.contactapp.service","com.kiran.contactapp.dao"})
@PropertySource({"classpath:database.properties"})
public class SpringRootConfig {
	
	@Inject 
	Environment env;
	
	@Bean
	public BasicDataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.user"));
		dataSource.setPassword(env.getProperty("jdbc.pass"));
		dataSource.setMaxTotal(Integer.valueOf(env.getProperty("jdbc.maxactive")));
		dataSource.setInitialSize(Integer.valueOf(env.getProperty("jdbc.initialsize")));
		return dataSource;
	}
	
	@Bean
	   public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
	      return new PersistenceExceptionTranslationPostProcessor(); 
	   }
	
	@Bean
    public LocalSessionFactoryBean getSessionFactory()
    {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(getDataSource());
		factoryBean.setHibernateProperties(getHibernateProperties());        
		factoryBean.setPackagesToScan(new String[]{"com.kiran.contactapp.domain"});
        return factoryBean;
    }

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s) {
	   HibernateTransactionManager txManager = new HibernateTransactionManager();
	   txManager.setSessionFactory(s);
	   return txManager;
	}	
	 
	 Properties getHibernateProperties() {
	      return new Properties() {
	         {
	            setProperty("hibernate.hbm2ddl.auto",env.getProperty("hibernate.hbm2ddl.auto"));
	            setProperty("hibernate.dialect",env.getProperty("hibernate.dialect"));
	            setProperty("hibernate.show_sql",env.getProperty("hibernate.show_sql"));
	         }
	      };
	   }
	
}
