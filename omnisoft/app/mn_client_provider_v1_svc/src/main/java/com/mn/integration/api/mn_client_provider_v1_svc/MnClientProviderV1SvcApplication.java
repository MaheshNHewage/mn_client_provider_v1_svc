package com.mn.integration.api.mn_client_provider_v1_svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
@ComponentScan
public class MnClientProviderV1SvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MnClientProviderV1SvcApplication.class, args);
	}

}
