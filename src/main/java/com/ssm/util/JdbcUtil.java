package com.ssm.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class JdbcUtil {
	
	public static String driver = "com.mysql.cj.jdbc.Driver";
	
	public static  String URL = "jdbc:mysql://localhost:3306/car?useSSL=false";    
	
	public static String username = "root";    
	
	public static String password = "1234";    
	
        /*    if(rs!=null) {  
                ResultSetMetaData rsmd = rs.getMetaData();  
                int countcols = rsmd.getColumnCount();  
                for(int i=1;i<=countcols;i++) {  
                    if(i>1) System.out.print(";");  
                    System.out.print(rsmd.getColumnName(i)+" ");  
                }  
                System.out.println("");  
                while(rs.next()) {  
                    System.out.print(rs.getString("sno")+"  ");  
                    System.out.print(rs.getString("sname")+"  ");  
                    System.out.print(rs.getString("ssex")+"  ");  
                    System.out.print(rs.getString("sage")+"  ");  
                    System.out.println(rs.getString("sdept")+"  ");  
                }  
            }  
            //System.out.println("Connect Successfull.");    
            System.out.println("ok");  
            rs.close();  
            st.close();  
            con.close();  */
	
	public static List<HashMap<String,Object>> getMapList (String sql){
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		Connection conn = null;  
        Statement st = null; 
        ResultSet rs = null;  
        try    
        {    
            Class.forName(driver);    
            conn=(Connection) DriverManager.getConnection(URL,username,password);    
            st=(Statement) conn.createStatement();  
            rs  = st.executeQuery(sql);
            if(rs!=null) {  
            	while(rs.next()) {  
            		 ResultSetMetaData rsmd = rs.getMetaData();  
                     int countcols = rsmd.getColumnCount();  
                     List<String> nameList = new ArrayList<String>();
                     for(int i=1;i<=countcols;i++) {  
                         String columnName = rsmd.getColumnLabel(i);  
                         nameList.add(columnName);
                     }  
                         HashMap<String, Object> map = new HashMap<String, Object>();
                         for(int j=0;j<nameList.size();j++){
                        	 String name = nameList.get(j);
                        	 String val = rs.getString(name);
                        	 map.put(name, val);
                         }
                         list.add(map);
            	}
    		}
        }    
        catch(Exception e)    
        {    
           e.printStackTrace();
        }finally{
        	colseResource(conn, st, rs);
        }
		
		return list;
	}
	
	public static HashMap<String,Object> getMap (String sql){
		HashMap<String, Object> map = new HashMap<String,Object>();
		Connection conn = null;  
        Statement st = null; 
        ResultSet rs = null;  
        try    
        {    
            Class.forName(driver);    
            conn=(Connection) DriverManager.getConnection(URL,username,password);    
            st=(Statement) conn.createStatement();  
            rs  = st.executeQuery(sql);
            if(rs!=null) {  
            	while(rs.next()) {  
            		 ResultSetMetaData rsmd = rs.getMetaData();  
                     int countcols = rsmd.getColumnCount();  
                     List<String> nameList = new ArrayList<String>();
                     for(int i=1;i<=countcols;i++) {  
                         String columnName = rsmd.getColumnLabel(i);  
                         nameList.add(columnName);
                     }  
                         for(int j=0;j<nameList.size();j++){
                        	 String name = nameList.get(j);
                        	 String val = rs.getString(name);
                        	 map.put(name, val);
                         }
            	}
    		}
        }    
        catch(Exception e)    
        {    
           e.printStackTrace();
        }finally{
        	colseResource(conn, st, rs);
        }
		
		return map;
	}
	
	
	public static String getString (String sql){
		String o = null;
		
		Connection conn = null;  
        Statement st = null; 
        ResultSet rs = null;  
        try    
        {    
            Class.forName(driver);    
            conn=(Connection) DriverManager.getConnection(URL,username,password);    
            st=(Statement) conn.createStatement();  
            rs  = st.executeQuery(sql);
            if(rs!=null) {  
            	while(rs.next()) {  
    			o = rs.getString(1);
            	}
    		}
        }    
        catch(Exception e)    
        {    
           e.printStackTrace();
        }finally{
        	colseResource(conn, st, rs);
        }
		
		return o;
	}
	
	public static int getInt (String sql){
		int o = 0;
		
		Connection conn = null;  
        Statement st = null; 
        ResultSet rs = null;  
        try    
        {    
            Class.forName(driver);    
            conn=(Connection) DriverManager.getConnection(URL,username,password);    
            st=(Statement) conn.createStatement();  
            rs  = st.executeQuery(sql);
            if(rs!=null) {  
            	while(rs.next()) {  
    			o = rs.getInt(1);
            	}
    		}
        }    
        catch(Exception e)    
        {    
           e.printStackTrace();
        }finally{
        	colseResource(conn, st, rs);
        }
		
		return o;
	}

	public static void update(String sql){
		Connection conn = null;
        Statement st = null; 
        int rs = 0;  
        try    
        {    
            Class.forName(driver);    
            conn=(Connection) DriverManager.getConnection(URL,username,password);    
            st=(Statement) conn.createStatement();  
            rs  = st.executeUpdate(sql);
        }    
        catch(Exception e)    
        {    
           e.printStackTrace();
        }finally{
        	colseResource(conn, st);
        }
	}
	
	
	/**
     * 释放资源
     * @param conn
     * @param st
     * @param rs
     */
    public static void colseResource(Connection conn,Statement st,ResultSet rs) {
        closeResultSet(rs);
        closeStatement(st);
        closeConnection(conn);
    }
    
    public static void colseResource(Connection conn,Statement st) {
        closeStatement(st);
        closeConnection(conn);
    }
    
	
	/**
     * 释放连接 Connection
     * @param conn
     */
    public static void closeConnection(Connection conn) {
        if(conn !=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //等待垃圾回收
        conn = null;
    }
    
    /**
     * 释放语句执行者 Statement
     * @param st
     */
    public static void closeStatement(Statement st) {
        if(st !=null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //等待垃圾回收
        st = null;
    }
    
    /**
     * 释放结果集 ResultSet
     * @param rs
     */
    public static void closeResultSet(ResultSet rs) {
        if(rs !=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //等待垃圾回收
        rs = null;
    }
    
	
	 public static void main(String[] args) {  
	        String driver = "com.mysql.jdbc.Driver";  
	        String URL = "jdbc:mysql://localhost:3306/car";  
	        Connection con = null;  
	        try  
	        {  
	            Class.forName(driver);  
	        }  
	        catch(java.lang.ClassNotFoundException e)  
	        {  
	            System.out.println("Cant't load Driver");  
	        }  
	        try     
	        {                                                                                 
	            con=(Connection) DriverManager.getConnection(URL,"root","1234");  
	            System.out.println("Connect Successfull.");  
	        }   
	        catch(Exception e)  
	        {  
	            System.out.println("Connect fail:" + e.getMessage());  
	        }  
	    }  
}
