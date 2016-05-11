package com.gabiksoft.app.jdbiapp.mappers;


import com.gabiksoft.app.jdbiapp.entity.MyTable;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MyTableMapper implements ResultSetMapper<MyTable> {

    @Override
    public MyTable map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new MyTable(resultSet.getInt("id"), resultSet.getString("name"));
    }
}
