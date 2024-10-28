package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClassMarker {
	public static void main(String[] args) {
		Marker m = new Marker("Cello", 50, "Red");
		
		try {
			FileOutputStream fos = new FileOutputStream("Marker.doc");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(m);
			oos.flush();
			FileInputStream fis = new FileInputStream("Marker.doc");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Marker mar=(Marker)ois.readObject();
			mar.display();
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
