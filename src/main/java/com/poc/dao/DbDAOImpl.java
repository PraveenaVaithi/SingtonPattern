package com.poc.dao;

import com.poc.entity.PermanentEmployee;
import com.poc.singleton.configuration.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbDAOImpl implements DbDAO {
    static Connection con= DbConnection.getConnections();
    static Connection con1= DbConnection.getConnections();

    @Override
    public int add(PermanentEmployee emp) throws SQLException {

        String query
                = "insert into permanent_employee(employeeName,"+ "location) VALUES (?,?)";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, emp.getEmployeeName());
        ps.setString(2, emp.getLocation());

        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public List<PermanentEmployee> getEmployees() throws SQLException {
        String query = "select * from permanent_employee";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<PermanentEmployee> ls = new ArrayList();

        while (rs.next()) {
            PermanentEmployee emp = new PermanentEmployee();
            emp.setEmployeeId(rs.getInt("employeeId"));
            emp.setEmployeeName(rs.getString("employeeName"));
            emp.setLocation(rs.getString("Location"));
            ls.add(emp);
        }
        return ls;
    }
}
