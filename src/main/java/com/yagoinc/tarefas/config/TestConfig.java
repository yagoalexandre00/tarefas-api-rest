package com.yagoinc.tarefas.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.yagoinc.tarefas.entities.User;
import com.yagoinc.tarefas.repository.UserRepository;

public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Yago Alexandre", "yago@gmail.com", "98983090786", "12345");
		User u2 = new User(null, "Juliana Reis", "juliana@gmail.com", "98983020092", "12345");
		User u3 = new User(null, "Luiz Fellipe", "luiz@gmail.com", "98983099036", "12345");

		userRepository.saveAll(Arrays.asList(u1, u2, u3));
	}

}