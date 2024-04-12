package com.enaa.crud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.enaa.crud.bean.Student;

public class StudentDAOImpl implements IStudentDAO{
	
	private static final String URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String INSERT_STUDENT = "INSERT INTO students VALUES(?, ?, ?, ?);";
    private static final String UPDATE_STUDENT = "UPDATE students SET first_name = ?, last_name = ?, email = ? WHERE studentId = ?;)";
    private static final String DELETE_STUDENT = "DELETE FROM students WHERE studentId = ?;)";
    private static final String SELECT_STUDENT = "SELECT * FROM students;)";
    
    public StudentDAOImpl() {

    }
    
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

	@Override
	public Student insertStudent(Student std) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student std) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int idStudent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> selectStudent(Student std) {
		// TODO Auto-generated method stub
		return null;
	}
    
    

    
    
}
