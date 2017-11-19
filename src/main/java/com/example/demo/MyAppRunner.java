package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MyAppRunner {

    @Autowired
    UserRepository repo;

    @Autowired
    ApplicationContext applicationContext;

    public void run() {
        for(String name : applicationContext.getBeanDefinitionNames()) {
            Object o = applicationContext.getBean(name);
            System.out.println(name + " : " + o.getClass());
        }

        User u = new User("a", "b");
        repo.save(u);
    }
}
