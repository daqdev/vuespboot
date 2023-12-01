package ar.com.telecom.fmvue.config;

import ar.com.telecom.fmvue.util.EncryptedDataSource;
import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManagerFactory;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Log
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "ar.com.telecom.fmvue.dao")
public class HibernateConfig {
	
	@Autowired
	private Environment env;

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setDatabase(Database.ORACLE);
		vendorAdapter.setGenerateDdl(false);

		log.info("DATASOURCE :" + dataSource());
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan("ar.com.telecom.fmvue.model");
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(additionalProperties());

		return em;
	}

	@Bean
	public DataSource dataSource() {
		
		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName(env.getProperty("fmvue.db.driverClassName"));
		ds.setJdbcUrl(env.getProperty("fmvue.db.url"));
		ds.setUsername(env.getProperty("fmvue.db.username"));
		ds.setPassword(EncryptedDataSource.decode(env.getProperty("fmvue.db.password")));
		ds.setAutoCommit(true);
		ds.setMaximumPoolSize(64);
		ds.setMinimumIdle(21);
		ds.setConnectionTimeout(20000L);
		ds.setIdleTimeout(10000L);
		ds.setMaxLifetime(1000);
		
		
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(env.getProperty("gcc.db.driverClassName"));
//		dataSource.setUrl(env.getProperty("gcc.db.url"));
//		dataSource.setUsername(env.getProperty("gcc.db.username"));
//		dataSource.setPassword(EncryptedDataSource.decode(env.getProperty("gcc.db.password")));
//
//		return dataSource;
		return ds;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);

		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	private Properties additionalProperties() {
		Properties properties = new Properties();
		try {
			properties.setProperty("hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect"));
			properties.setProperty("hibernate.current_session_context_class", env.getProperty("spring.jpa.properties.hibernate.current_session_context_class"));
			properties.setProperty("hibernate.show_sql", env.getProperty("spring.jpa.show-sql"));
			properties.setProperty("hibernate.format_sql", env.getProperty("spring.jpa.properties.hibernate.format_sql"));
		} catch (Exception e) {
			log.info("Error al cargar las propiedades de hibernate");
		}
		return properties;
	}

}
