package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClassEmp {
	public static void main(String[] args) {
		Employee emp = new Employee("Ram", 2, 50000, "HYD");
		
		try {
			FileOutputStream fos = new FileOutputStream("Employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.flush();
			FileInputStream fis = new FileInputStream("Employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee em= (Employee) ois.readObject();
			em.display();
			oos.close();
			System.out.println("Data Stored");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
