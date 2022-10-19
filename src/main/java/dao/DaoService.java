package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DaoService {

    public Connection getConnection(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres","Shruti*123");

            return connection;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }
}
