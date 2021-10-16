package com.jakubwasikowski;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Jakub\\Desktop\\JavaProgrammingMasterclass\\Databases\\JDBCInsertUpdateDelete\\testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts" +
                    "(name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Jim', 765432, 'Jim@anywhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                              "VALUES('Joe', 45632, 'joe@anywhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Jane', 4829484, 'jane@somewhere.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Fido', 9038, 'dog@email.com')");
//            statement.execute("update contacts set phone=5566789 where name='Jane'");
//            statement.execute("Delete from contacts where name='Joe'");

            statement.execute("Select * from contacts");
            ResultSet results=statement.getResultSet();
            while (results.next()){
                System.out.println(results.getString("name")+" "+
                                   results.getInt("phone")+" "+
                                   results.getString("email"));
            }
            results.close();

            statement.close();
            conn.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}