package com.app.testRightstep;

import com.app.testRightstep.service.FigureService;
import com.app.testRightstep.util.FigureTestData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestRightstepApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestRightstepApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(FigureService figureService) {
		return (args) -> {
			FigureTestData.getAllFigures().forEach(figureService::save);
		};
	}

}
