package com.project.sendemails.datasource;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySqlDataSource implements DataSource{

    //Implement method of DataSource interface
    @Override
    public String[] getEmails() {
        return new String[]{"MySQL: email1", "MySQL: email2", "MySQL: email3"};
    }
}
