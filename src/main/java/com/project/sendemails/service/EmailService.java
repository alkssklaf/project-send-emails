package com.project.sendemails.service;

import com.project.sendemails.datasource.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;

@Service
public class EmailService {

     DataSource dataSource;

     @Autowired
     public EmailService(DataSource dataSource){
         this.dataSource = dataSource;
     }

     public void sendEmail(){
         System.out.println("Sending emails....");
         Arrays.stream(dataSource.getEmails()).toList().forEach(System.out::println);
     }

}
