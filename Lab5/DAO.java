package Lab5;

import Lab3.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public interface DAO <T> {
    default Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection result=DriverManager.getConnection("jdbc:sqlite:PATH_TO_FILE"); 
        return result;
    }
    T create(T entity);
    boolean update(T entity);
    boolean delete(String id);
    List<T> find(T entity);
    default List<T> findById(String id){
        List<T> result=new ArrayList<>();
        return result;
    }
    List<T> findAll();
}