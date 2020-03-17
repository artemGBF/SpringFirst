package com.gbf.springfirst.repository;

import com.gbf.springfirst.model.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Profile("first")
public class UserRepositoryInstant extends UserRepository{

    @PostConstruct
    @Override
    public void readUsers(){
        super.lst.add(new User("artem", "12"));
        super.lst.add(new User("vadim", "yet"));
        super.lst.add(new User("anton", "gyyygg"));
    }

    @PreDestroy
    @Override
    public void writeUsers(){
        System.out.println(super.lst);
    }


}
