package com.infytel.friend.family.infitelfriendfamily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.infytel.friend.family.infitelfriendfamily.*")
public class InfitelFriendFamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfitelFriendFamilyApplication.class, args);
	}

}
