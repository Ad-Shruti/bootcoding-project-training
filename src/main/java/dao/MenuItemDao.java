package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MenuItemDao {
    public static final String TABLE_NAME = "app_menu_item_dao";
    private DaoService daoService;
    public MenuItemDao(){
        // inside constructor
        daoService = new DaoService();
    }

    public void createTable(){
        try {
            //1 load jdbc driver
//            Class.forName("org.postgresql.Driver");
//            //2 establish connection with local db
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
//                    "postgres","Shruti*123");
            //create statement object
            Connection connection = daoService.getConnection();
            Statement statement = connection.createStatement();

            //4 Execute query(statement)
            String sql = "Select * from " + TABLE_NAME;

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + "(id bigint NOT NULL,"
                    + "name text,"
                    + "phone_number bigint,"
                    + "address text,"
                    + "city text,"
                    + "CONSTRAINT app_menu_item_dao_pk PRIMARY KEY(id))";

            System.out.println("Create Table Query : " + query);

            statement.executeUpdate(query);
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
