package com.gabiksoft.app.jdbiapp;


import com.gabiksoft.app.jdbiapp.service.Service;
import org.h2.jdbcx.JdbcConnectionPool;
import org.postgresql.ds.PGPoolingDataSource;
import org.postgresql.osgi.PGDataSourceFactory;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;

import javax.sql.DataSource;
import java.util.concurrent.TimeUnit;

public class LauncherJDBI {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//
//        String CONNECTIO_URL = "jdbc:postgresql://localhost:5432/Test";
//        String CONNECTIO_LOGIN = "postgres";
//        String CONNECTIO_PASSWORD = "1111";
//
//        System.out.println("Loading driver...");
//        Class.forName("org.postgresql.Driver");
//        System.out.println("Driver loaded.");
//
//
//
//
//        PGPoolingDataSource source = new PGPoolingDataSource();
//        source.setDataSourceName("A Data Source");
//        source.setServerName("localhost");
//        source.setDatabaseName("Test");
//        source.setUser("postgres");
//        source.setPassword("1111");
//        source.setMaxConnections(10);
//
//
//        DataSource dataSource = source;
//        DBI dbi = new DBI(dataSource);
//        Handle handle = dbi.open();
//        handle.execute("create table something (id int primary key, name varchar(100))");
//        handle.close();
        Service service = new Service();
        service.open();
        service.close();
    }
}
