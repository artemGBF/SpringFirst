package com.gbf.springfirst;

import com.gbf.springfirst.model.User;
import com.gbf.springfirst.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFirstApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringFirstApplication.class, args);
    }

    @Autowired
    @Qualifier("userRepositoryInstant")
    private UserRepository users;

    @Override
    public void run(String... args) throws Exception {
        users.add(new User("bob", "pass"));
        users.println();
        users.delete(new User("artem", "12"));
        users.sort();
    }

    /*@Autowired
    //@Qualifier("testComponent2")
    private TestComponent testComponent;*/


    /*@Override
    public void run(String... args) throws Exception {
        testComponent.sayHello();
    }*/

   /* @PostConstruct
    private void init(){
        System.out.println("SpringFirstApplication.init");
    }*/
}
