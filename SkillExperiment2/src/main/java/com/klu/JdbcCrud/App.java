package com.klu.JdbcCrud;
import java.sql.*;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try
        {
        //1.Load the Driver	
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.Connect to Database
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/s25","root","welcome");
        //3.Create a Statement object
        Statement stmt=con.createStatement(); 
        //4.Sending Query to database
        String query="select * from Student";
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next())
        {
        	int a=rs.getInt(1);
        	String b=rs.getString(2);
        	int c=rs.getInt(3);
        	System.out.print(a+""+b+""+c);

        }
        con.close();
        
        }
        catch(Exception e)
        {
        	
        
        }
    }
}