package com.csse.service;


import org.xml.sax.SAXException;

import com.csse.common.c3;
import com.csse.model.Employee;

import java.sql.Connection;
import java.util.logging.Logger;
import java.sql.DriverManager;
import javax.xml.parsers.ParserConfigurationException;
import java.sql.PreparedStatement;
import javax.xml.xpath.XPathExpressionException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.Statement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class EmployeeServiceImpl1 extends AbstractService {

    private static Connection connection;
    private static Statement statement;
    private final ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
    private PreparedStatement preparedStatement;

    public EmployeeServiceImpl1() {
        try {
            Class.forName(CommonConstant.JDBC_DRIVER);
            connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),
                    properties.getProperty("password"));
        } catch (Exception e) {
            log.log(Level.SEVERE, e.getMessage());
        }
    }

    public void getEmployee() {
        try {
            int s = c3.XMLXPATHS().size();
            for (int i = 0; i < s; i++) {
                Map<String, String> e5 = c3.XMLXPATHS().get(i);
                Employee e6 = new Employee();
                e6.e1(e5.get("XpathEmployeeIDKey"));
                e6.connection(e5.get("XpathEmployeeNameKey"));
                e6.e3(e5.get("XpathEmployeeAddressKey"));
                e6.e4(e5.get("XpathFacultyNameKey"));
                e6.e5(e5.get("XpathDepartmentKey"));
                e6.e6(e5.get("XpathDesignationKey"));
                el.add(e6);
                System.out.println(e6.toString() + "\n");
            }
        } catch (Exception e) {
        }
    }

    public void createEmployee() {
        try {
            e3 = connection.createStatement();
            e3.executeUpdate(c2.Q("q2"));
            e3.executeUpdate(c2.Q("q1"));
        } catch (Exception e) {
        }
    }

    public void getAllEmployees() {
        try {
            e4 = connection.prepareStatement(c2.Q("q3"));
            connection.setAutoCommit(false);
            for (int i = 0; i < el.size(); i++) {
                Employee e = el.get(i);
                e4.setString(1, e.e1());
                e4.setString(2, e.connection());
                e4.setString(3, e.e3());
                e4.setString(4, e.e4());
                e4.setString(5, e.e5());
                e4.setString(6, e.e6());
                e4.addBatch();
            }
            e4.executeBatch();
            connection.commit();
        } catch (Exception e) {
        }
    }

    public void getEmployeeById(String eid) {

        Employee e = new Employee();
        try {
            e4 = connection.prepareStatement(c2.Q("q4"));
            e4.setString(1, eid);
            ResultSet R = e4.executeQuery();
            while (R.next()) {
                e.e1(R.getString(1));
                e.connection(R.getString(2));
                e.e3(R.getString(3));
                e.e4(R.getString(4));
                e.e5(R.getString(5));
                e.e6(R.getString(6));
            }
            ArrayList<Employee> l = new ArrayList<Employee>();
            l.add(e);
            e7(l);
        } catch (Exception ex) {
        }
    }

    public void deleteEmployee(String eid) {

        try {
            e4 = connection.prepareStatement(c2.Q("q6"));
            e4.setString(1, eid);
            e4.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a5() {

        ArrayList<Employee> e1 = new ArrayList<Employee>();
        try {
            e4 = connection.prepareStatement(c2.Q("q5"));
            ResultSet connection = e4.executeQuery();
            while (connection.next()) {
                Employee e = new Employee();
                e.e1(connection.getString(1));
                e.connection(connection.getString(2));
                e.e3(connection.getString(3));
                e.e4(connection.getString(4));
                e.e5(connection.getString(5));
                e.e6(connection.getString(6));
                e1.add(e);
            }
        } catch (Exception e) {
        }
        e7(e1);
    }

    public void e7(ArrayList<Employee> l) {

        System.out.println("Employee ID" + "\t\t" + "Full Name" + "\t\t" + "Address" + "\t\t" + "Faculty Name" + "\t\t"
                + "Department" + "\t\t" + "Designation" + "\n");
        System.out
                .println("================================================================================================================");
        for (int i = 0; i < l.size(); i++) {
            Employee e = l.get(i);
            System.out.println(e.e1() + "\t" + e.connection() + "\t\t"
                    + e.e3() + "\t" + e.e4() + "\t" + e.e5() + "\t"
                    + e.e6() + "\n");
            System.out
                    .println("----------------------------------------------------------------------------------------------------------------");
        }

    }
}
