package com.gabiksoft.app.jdbiapp.dao;


import com.gabiksoft.app.jdbiapp.entity.MyTable;
import com.gabiksoft.app.jdbiapp.mappers.MyTableMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

@RegisterMapper(MyTableMapper.class)
public interface Dao {

    @SqlUpdate("insert into my_table(id, name) values (:id, :name)")
    public void insert(@Bind("id") int id, @Bind("name") String name);

    @SqlUpdate("delete from my_table where id = :row.id")
    public void delete(@BindBean("row") MyTable object);

    @SqlQuery("select * from my_table where id= :id")
    public MyTable getById(@Bind("id") int id);
}
