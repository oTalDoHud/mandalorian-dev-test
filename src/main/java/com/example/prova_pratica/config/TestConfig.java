package com.example.prova_pratica.config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		Pattern p = Pattern.compile("[a-zA-Z0-9 ]{10,}");

		Matcher test1 = p.matcher("Vocês vão vir aqui?");
		Matcher test2 = p.matcher("não sei");
		Matcher test3 = p.matcher("Frase comum para teste 01234");
		System.out.println(test1.matches());
		System.out.println(test2.matches());
		System.out.println(test3.matches());
	}
}
