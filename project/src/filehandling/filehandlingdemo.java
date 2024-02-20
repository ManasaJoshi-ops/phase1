package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandlingdemo {
	public static void main(String[] args) {
//		fileInputStreamdemo();
//		fileOutputStream();
//		fileReader();
//		fileWriter();
		bufferReader();
	}
	static void fileInputStreamdemo() {
		int i;
		File myfile=new File("C:\\Users\\manjoshi\\Desktop\\file.txt");
		
		try {
			FileInputStream fis=new FileInputStream(myfile);
			System.out.println("File Opened..");
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    static void fileOutputStream() {
		int i;
		File myfile=new File("C:\\Users\\manjoshi\\Desktop\\file.txt");
		try {
			FileOutputStream fos=new FileOutputStream(myfile);
     		System.out.println("File Opened..");
			String data = "hello there";
			byte[] dataByteArray = data.getBytes();
			fos.write(dataByteArray);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void fileReader() {
		int i;
		File myfile=new File("C:\\Users\\manjoshi\\Desktop\\file.txt");
		
		try {
			FileReader fis=new FileReader(myfile);
			System.out.println("File Opened..");
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void fileWriter() {
		File myfile=new File("C:\\Users\\manjoshi\\Desktop\\file.txt");
		try {
			FileWriter fw=new FileWriter(myfile);
     		System.out.println("File Opened..");
			fw.write("hello\n");
			fw.write("whgffn");
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void bufferReader() {
		String line;
		File myfile=new File("C:\\Users\\manjoshi\\Desktop\\file.txt");
		
		try {
			FileReader fr=new FileReader(myfile);
			BufferedReader br=new BufferedReader(fr);
			System.out.println("File Opened..");
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}


