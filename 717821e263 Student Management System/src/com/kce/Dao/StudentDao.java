package com.kce.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.kce.Util.DBUtil;
import com.kce.bean.Student;

public class StudentDao {
	private static Connection con;
	private static PreparedStatement psmt;
	private static Statement st;
	private static ResultSetMetaData rsMetaData;
	private static Scanner sc = new Scanner(System.in);
	private static ResultSet rs;

	public static void create() throws ClassNotFoundException,SQLException{
	con=DBUtil.getConnection();
	psmt = con.prepareStatement("create table Student_Details(STUDENT_ID int(10)PRIMARY KEY,"+"NAME varchar(20)NOT NULL,"+"EMAIL varchar(30)NOT NULL,UNIQUE(email),"+"PHONE_NO varchar(10),"+"DEPT varchar(30),"+"ADRESS varchar(30)");
	System.out.println("Table is created.........");
	}
	public static void insertValues(int noofstudents)throws ClassNotFoundException,SQLException{
	con = DBUtil.getConnection();
	psmt = con.prepareStatement("insert into student values(?,?,?,?,?,?)");
	for(int i=0;i<noofstudents;i++) {
	System.out.println("Enter the ID:");
	psmt.setInt(1, sc.nextInt());
	System.out.println("Enter the name:");
	psmt.setString(2, sc.next());
	System.out.println("Enter the email:");
	psmt.setString(3,sc.next());
	System.out.println("Enter the phone number:");
	psmt.setString(4,sc.next());
	System.out.println("Enter the department name:");
	psmt.setString(5,sc.next());
	System.out.println("Enter the Adress:");
	psmt.setString(6,sc.next());
	}
	System.out.println("Table is inserted......!");
	}
	public static void deleteRecord(int id)throws ClassNotFoundException,SQLException{
	con=DBUtil.getConnection();
	st=con.createStatement();
	st.executeUpdate("delete from students where Student_Id="+id);
	System.out.println("Row is Deleted....");
	}
	
	public static void showDetails()throws ClassNotFoundException,SQLException{
	con=DBUtil.getConnection();
	st=con.createStatement();
	rs=st.executeQuery("select * from Student_Details");
	while(rs.next()) {
	System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t\t"+rs.getString(5)+"\t\t"+rs.getString(6));
	}
	}
	public static void deleteTable()throws ClassNotFoundException,SQLException{
	con = DBUtil.getConnection();
	st=con.createStatement();
	st.execute("drop table Student_Details");
	System.out.println("Table is dropped...");
	}
	public static void deleteRows() throws ClassNotFoundException,SQLException{
	con=DBUtil.getConnection();
	st=con.createStatement();
	st.execute("truncate table Student_Details");
	System.out.println("Table Record has been deleted....");
	}
	public static void UpdateRecord()throws ClassNotFoundException,SQLException{
	con=DBUtil.getConnection();
	st=con.createStatement();
	String str,data;
	int choice,id;
	System.out.println("Enter the id to Update:");
	id = sc.nextInt();
	rs=st.executeQuery("select * from Student_Details");
	rsMetaData=rs.getMetaData();
	for (int i=1;i<=9;i++) {
	System.out.println(i+"\t\t"+rs.getMetaData().getColumnName(i));
	}
	System.out.println("Enter the choice:");
	choice=sc.nextInt();
	str=rsMetaData.getColumnName(choice);
	System.out.println("Enter the new data:");
	data=sc.next();
	if(choice==1 && choice==9) {
	st.executeUpdate("update Student_Details set"+str+"where Student_Id="+id);
	}
	else {
	st.executeUpdate("update Student_Id set"+str+"where Student_Id="+id);
	}
	}
	public static void ShowOption() {
	System.out.println("1\t\tCreating table"+"\n"+"2\t\tInserting the Records"+"\n"+"3\t\tUpdating the data"+"\n"+"4\t\tDeleting the Record"+"\n"+"5\t\tDeleting the rows"+"\n"+"6\t\tDeleting the table"+"\n"+"7\t\tDisplay the data"+"\n"+"8\t\tQuit");
	}
}






