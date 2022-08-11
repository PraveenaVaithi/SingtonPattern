package com.poc.dao;

import com.poc.entity.PermanentEmployee;

import java.sql.SQLException;
import java.util.List;

public interface DbDAO {

    public int add(PermanentEmployee emp) throws SQLException;

    public List<PermanentEmployee> getEmployees() throws SQLException;

}
