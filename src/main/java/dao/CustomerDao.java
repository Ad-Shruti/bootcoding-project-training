package dao;

import model.Customer;

import java.sql.*;

public class CustomerDao {

    public static final String TABLE_NAME = "app_customer";
    private DaoService daoService;

    public CustomerDao() {
        // inside constructor
        daoService = new DaoService();
    }

    public void insertCustomer(Customer customer) {
        try {
            Connection connection = daoService.getConnection();
            String sql = "INSERT INTO " + TABLE_NAME
                    + " VALUES( ?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, customer.getId());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setLong(3, customer.getPhoneNo());
            preparedStatement.setString(4, customer.getAddress());
            preparedStatement.setString(5, customer.getCity());
            //preparedStatement.setString(6,customer.getEmailId());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void createTable() {
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
                    + "CONSTRAINT app_customer_pk PRIMARY KEY(id))";

            System.out.println("Create Table Query : " + query);

            statement.executeUpdate(query);
            ResultSet resultSet = statement.executeQuery(sql);

            //5 traverse ResultSet(data)
            while (resultSet.next()) {
                //columnlabel is whatever u write in database column
                System.out.println("=" + resultSet.getString("name"));
                System.out.println("=" + resultSet.getString("address"));
                System.out.println("=" + resultSet.getString("phone_number"));
                System.out.println("=" + resultSet.getString("city"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
