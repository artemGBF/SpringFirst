package com.gbf.springfirst.testComponent;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("testComponent2")
@Profile("!dev")
public class TestComponentImpl2 implements TestComponent{
    private String info;

    @PostConstruct
    public void init(){
        this.info="Information2";
        System.out.println("Hello");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bye");
    }

    @Override
    public void sayHello(){
        System.out.println(info);
    }
}
