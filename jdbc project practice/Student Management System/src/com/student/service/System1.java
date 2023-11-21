package com.student.service;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class System1 implements Operation{

	@Override
	public void addStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into students(mobileno,name,gender,fees) values(?,?,?,?)");
			preparedStatement.setLong(1, 8792106527l);
			preparedStatement.setString(2, "Sanvi");
			preparedStatement.setString(3, "Female");
			preparedStatement.setDouble(4, 10000.00);
			preparedStatement.execute();
			System.out.println("Success..");
			connection.close();
			
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void getStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("select * from students");
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getLong(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println(resultSet.getDouble(5));
			}	
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sanu","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into students values(?,?,?,?,?)");
			
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into students values(?,?,?,?,?)");
			
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System1 s=new System1();
		s.getStudent();
	}
	
	
}
