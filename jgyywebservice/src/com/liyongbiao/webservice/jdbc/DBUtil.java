package com.liyongbiao.webservice.jdbc;

import java.sql.*;



public class DBUtil {
	  
	
	
	public static void main(String[] args) {
		
	   String url="jdbc:sqlserver://liyongbiao:1433; DatabaseName=Love";
	   String user="sa";
	   String password="love";
	   
	   
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");			
			connection = DriverManager.getConnection(url, user, password);
			String sql="select * from t_user";
			preparedStatement = connection.prepareStatement(sql);
			  
			  resultSet = preparedStatement.executeQuery();
			  
			  while(resultSet.next())
			  {
				  System.out.println(resultSet.getInt("id")+"   "+resultSet.getString("name"));
			  }
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		finally
		{
			
			if(resultSet !=null)
			{
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally
				{
					resultSet=null;	
				}							
			}
			
			
			if(preparedStatement !=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally
				{
					preparedStatement=null;	
				}							
			}
			

			if(connection !=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally
				{
					connection=null;	
				}							
			}					
		}
	}
	

}
