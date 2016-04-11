package ua.com.rozetka.pages;
import java.sql.*;

public class ConnectionDB {
 
    private  final String url = "jdbc:mysql://127.0.0.1:3306/demo?useSSL=false";
    private  final String user = "root";
    private  final String password = "1234";
    private  Connection con;
    private  Statement stmt;
    private  ResultSet rs;
    private  PreparedStatement preparedStatement;
   
    public  void setDB(String model, String price) {
        
        try {
            con = DriverManager.getConnection(url, user, password);
            preparedStatement = con.prepareStatement("INSERT INTO demo.phones (model, price) VALUES (?, ?);");
            preparedStatement.setString(1, model);
            preparedStatement.setString(2, price);
            preparedStatement.executeUpdate();
            
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
           
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { preparedStatement.close(); } catch(SQLException se) { /*can't do anything */ }
                   }}
        
    public void getDB(){
    	
    	try {
    		 con = DriverManager.getConnection(url, user, password);
    		String query = "select * from phones order by id desc limit 15";
       	 stmt = con.createStatement();
            rs = stmt.executeQuery(query);
    		   while (rs.next()) {
                   int        id = rs.getInt("id");
                   String modelDB = rs.getString("model");
                   int    priceDB = rs.getInt("price");
                   String time = rs.getString("time");
                   System.out.println(id + " " + modelDB+" "+ priceDB +" "+ time);
               }
    		  		
			
    	  } catch (SQLException sqlEx) {
              sqlEx.printStackTrace();
          } finally {
             
              try { con.close(); } catch(SQLException se) { /*can't do anything */ }
              try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
              try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
          }}
          
       
        	
        
        
    
 
}