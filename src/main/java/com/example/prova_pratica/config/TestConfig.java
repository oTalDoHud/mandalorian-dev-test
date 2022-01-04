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

		Matcher m = p.matcher("Vocês vão vir aqui?");
		Matcher t = p.matcher("não sei");
		Matcher y = p.matcher("Frase comum para teste 01234");
		System.out.println(m.matches());
		System.out.println(t.matches());
		System.out.println(y.matches());
	}
}
