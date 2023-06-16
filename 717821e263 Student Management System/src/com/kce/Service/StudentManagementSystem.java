package com.kce.Service;

import java.sql.SQLException;
import java.util.Scanner;
import com.kce.Dao.StudentDao;
import com.kce.Util.DBUtil;

public class StudentManagementSystem {
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		StudentDao s = new StudentDao();
		Scanner sc=new Scanner(System.in);
	        s.ShowOption();
	        while(true) {
	        int choice;
	        System.out.println("Enter the choice:");
	        choice=sc.nextInt();
	        switch(choice) {
	        case 1:
	        s.create();
	        break;
	        case 2:
	        System.out.println("Enter the number of records to be inserted:");
	        s.insertValues(sc.nextInt());
	        break;
	        case 3:
	       s. UpdateRecord();
	        break;
	        case 4:
	        System.out.println("Enter the id to be deleted:");
	        s.deleteRecord(sc.nextInt());
	        break;
	        case 5:
	        s.deleteRows();
	        break;
	        case 6:
	        s.deleteTable();
	        break;
	        case 7:
	        s.showDetails();
	        break;
	        case 8:
	        System.out.println("THANK YOU!!!!!");
	        System.exit(0);
	        break;
	        case 9:
	        s.ShowOption();
	        break;
	        default:
	        System.out.println("INVALID CHOICE....");
	       
	        }
	        }
	}

	}


