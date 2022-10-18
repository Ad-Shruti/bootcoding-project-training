package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDao {

    public static final String TABLE_NAME = "customer";

    public void createTable(){
        try {
            //1 load jdbc driver
            Class.forName("org.postgresql.Driver");
            //2 establish connection with local db
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "shruti","Shruti*123");
            //create statement object
            Statement statement = connection.createStatement();

            //4 Execute query(statement)
            String sql = "Select * from " + TABLE_NAME;
            ResultSet resultSet = statement.executeQuery(sql);

            //5 traverse ResultSet(data)
            while (resultSet.next()){
                //columnlabel is whatever u write in database column
                System.out.println("=" + resultSet.getString("name"));
                System.out.println("=" + resultSet.getString("address"));
                System.out.println("=" + resultSet.getString("phone_number"));
                System.out.println("=" + resultSet.getString("city"));
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
