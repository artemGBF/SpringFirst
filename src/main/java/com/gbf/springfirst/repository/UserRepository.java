package com.gbf.springfirst.repository;

import com.gbf.springfirst.model.User;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

@Component
public abstract class UserRepository {
    protected ArrayList<User> lst = new ArrayList<>();

    abstract void readUsers() throws IOException;

    public void add(User a){
        this.lst.add(a);
    }

    public void delete(User a){
        this.lst.remove(a);
    }

    public void sort(){
        this.lst.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getPassword().length(), o2.getPassword().length());
            }
        });
    }

    public void println(){
        this.lst.forEach(System.out::println);
    }

    abstract void writeUsers() throws IOException;
}
