package com.project.sendemails.datasource;

import org.springframework.stereotype.Component;

@Component
public class PostgreSqlDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        return new String[]{"PostgreSQL: email1", "PostgreSQL: email2", "PostgreSQL: email3"};
    }
}
