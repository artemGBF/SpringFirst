package com.gbf.springfirst.repository;

import com.gbf.springfirst.model.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;

@Component
@Profile("second")
public class UserRepositoryFile extends UserRepository {

    @PostConstruct
    @Override
    public void readUsers() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        while (br.ready()){
            String[] s = br.readLine().split(" ");
            User u = new User(s[0], s[1]);
            super.lst.add(u);
        }
        br.close();
    }

    @PreDestroy
    @Override
    public void writeUsers() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        for(User user:super.lst){
            bw.write(user.toString());
        }
        bw.close();
    }
}
