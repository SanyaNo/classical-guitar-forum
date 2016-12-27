package com.classical.guitar.domain;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DBConfig {

	@Bean
	   public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	      LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
	      emf.setDataSource(dataSource());
	      emf.setPackagesToScan(new String[] { "www.classical.guitar.domain" });
	 
	      JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	      emf.setJpaVendorAdapter(vendorAdapter);
	      emf.setJpaProperties(additionalProperties());
	      emf.setPersistenceProviderClass(HibernatePersistenceProvider.class);
	      emf.afterPropertiesSet();
	      return emf;//.getObject()
	   }
	 
	   @Bean
	   public DataSource dataSource(){
	      DriverManagerDataSource dataSource = new DriverManagerDataSource();
	      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	      dataSource.setUrl("jdbc:mysql://localhost:3306/spring_app?useSSL=false");
	      dataSource.setUsername( "admin" );
	      dataSource.setPassword( "adagio" );
	      return dataSource;
	   }
	  
	   @Bean
	   public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
	      JpaTransactionManager transactionManager = new JpaTransactionManager();
	      transactionManager.setEntityManagerFactory(emf);
	 
	      return transactionManager;
	   }
	 
	   @Bean
	   public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
	      return new PersistenceExceptionTranslationPostProcessor();
	   }
	 
	   Properties additionalProperties() {
	      Properties properties = new Properties();
	      properties.setProperty("hibernate.hbm2ddl.auto", "update");
	      properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	      properties.getProperty("hibernate.show_sql", "true");
	      properties.getProperty("hibernate.format_sql", "true");
	      properties.getProperty("hibernate.connection.charSet", "UTF-8");
	      return properties;
	   }

}