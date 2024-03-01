package com.perscholas.exercisenine;

import com.perscholas.exercisenine.myServices.Coach;
import com.perscholas.exercisenine.myServices.TennisCoach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.perscholas.exercisenine.myServices"})
// Note: in above line, "myServices" is a package name
public class IocdemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(IocdemoApplication.class, args);
// get the bean from spring container
        Coach coach = context.getBean(Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

    }
}