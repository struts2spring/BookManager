package com.example.springhibernate;

import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfiguration {

//	@Value("#{dataSource}")
//	private DataSource dataSource;
//
//	@Bean
//	public AnnotationSessionFactoryBean sessionFactoryBean() {
//		Properties props = new Properties();
//		props.put("hibernate.dialect", H2Dialect.class.getName());
//		props.put("hibernate.format_sql", "true");
//
//		AnnotationSessionFactoryBean bean = new AnnotationSessionFactoryBean();
//		bean.setAnnotatedClasses(new Class[]{Item.class, Order.class});		
//		bean.setHibernateProperties(props);
//		bean.setDataSource(this.dataSource);
//		bean.setSchemaUpdate(true);
//		return bean;
//	}
//
//	@Bean
//	public HibernateTransactionManager transactionManager() {
//		return new HibernateTransactionManager( sessionFactoryBean().getObject() );
//	}

}
