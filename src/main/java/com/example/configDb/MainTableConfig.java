package com.example.configDb;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration

@EnableJpaRepositories (
        entityManagerFactoryRef = "entityManager",
        transactionManagerRef = "entityTransactionManager",
        basePackages = {"com.example.mainDb"}
)

@EnableTransactionManagement
public class MainTableConfig {

    @Primary
    @Bean (name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource sweatterDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "entityManager")
    public LocalContainerEntityManagerFactoryBean sweatterEntityManager(
            EntityManagerFactoryBuilder builder, @Qualifier("dataSource") DataSource secDataSource) {
        return builder
                .dataSource(secDataSource)
                .packages("com.example.mainDb")
                .persistenceUnit("sweatter")
                .build();
    }
    @Primary
    @Bean(name = "entityTransactionManager")
    public PlatformTransactionManager barTransactionManager
            (@Qualifier("entityManager") EntityManagerFactory sweatterManager) {
        return new JpaTransactionManager(sweatterManager);
    }


}
