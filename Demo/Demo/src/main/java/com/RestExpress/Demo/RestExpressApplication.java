package com.RestExpress.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.tinylog.Logger;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RestExpressApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestExpressApplication.class, args);
		Logger.info("Hello");
	}

}
