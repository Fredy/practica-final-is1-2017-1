package app;

import controller.CursoContoller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import config.WebConfig;
import domain.BaseEntity;
import org.springframework.stereotype.Controller;
import repository.CursoRepository;
import service.CursoService;

import javax.annotation.PostConstruct;

//@Import(WebConfig.class)
//@EntityScan(basePackageClasses=BaseEntity.class)
@SpringBootApplication
public class BankApplication {

	//PARA PRUEBAS:
	//@Autowired
	//CursoRepository cursoRepository;

	@PostConstruct
	void init() {
		//CursoContoller
	}

		public static void main(String[] args) throws Exception {
		SpringApplication.run(BankApplication.class, args);
	}
}
