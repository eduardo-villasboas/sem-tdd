package withttoutdd.example.nontdd;

import org.springframework.boot.SpringApplication;

public class TestNontddApplication {

	public static void main(String[] args) {
		SpringApplication.from(NonTddApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
