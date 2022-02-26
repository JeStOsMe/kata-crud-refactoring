package co.com.sofka.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(CrudApplication.class, args);
		} catch (Throwable ex){
			ex.printStackTrace();
		}
	}

}
