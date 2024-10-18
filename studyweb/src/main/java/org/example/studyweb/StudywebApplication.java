package org.example.studyweb;

import org.example.studyweb.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudywebApplication {
    public static User globalUser;
    public static void main(String[] args) {
        globalUser = new User();
        SpringApplication.run(StudywebApplication.class, args);
    }

}
