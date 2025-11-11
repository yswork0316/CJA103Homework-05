package hw7;



import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;






//1.請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
public class Hw7 {
	public static void main(String[] args) {
			File f1 = new File("C:\\Users\\TMP-214\\Downloads\\JAVA\\作業\\Homework7\\Sample.txt");
			System.out.print("Sample.txt檔案共有" + f1.length() + "個位元組，");
			try {
				FileReader fr = new FileReader(f1);
				int i;
				int countChar = 0;
				int countLine = 1;
				while((i = fr.read()) != -1) {
					countChar += 1;
					if(i == 10) {
						countLine += 1;
					}
				}
				System.out.print(countChar + "個字元");
				System.out.print(countLine + "列資料");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}


//2.請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
//append功能讓每次執行結果都能被保存起來)

//public class Hw7 {
//
//	public static void main(String[] args) {
//		FileOutputStream fos;
//		try {
//			fos = new FileOutputStream("C:\\Users\\TMP-214\\Downloads\\JAVA\\作業\\Homework7\\Data.txt",true);
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		PrintStream ps = new PrintStream(bos);
//		for(int i = 0; i < 10; i++) {
//			ps.print((int) (Math.random()*1000 + 1) + "\t");
//		}
//		ps.println();
//		ps.close();
//		bos.close();
//		fos.close();
//		} catch (IOException e) {
//			System.err.println(e);
//		}
//		
//	}
//}


//3.請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//代表的檔案會複製到第二個參數代表的檔

//public class Hw7 {
//	public static void copyFile(File inputFile, File outputFile) throws IOException {
//		
//		
//		FileReader in = new FileReader(inputFile);
//		FileWriter out = new FileWriter(outputFile);
//		int c;
//		
//		while ((c = in.read())!= -1) {
//			out.write(c);
//			System.out.print((char) c);
//			System.out.flush();
//		}
//		
//		in.close();
//		out.close();
//		
//	}
//	
//	public static void main(String[] args) throws IOException {
//		File inputFile = new File("test1.txt");
//		File outputFile = new File("test2.txt");
//		copyFile(inputFile,outputFile);
//		
//	}
//}

//4.請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
//5.承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
//型簡化本題的程式設計)

//public class Hw7 {
//	public static void main (String[] args) throws Exception {
//		File dir = new File("C:\\data");
//		dir.mkdir();
//		
//		File file = new File("C:\\data\\Object.ser");
//		
//		Animal[] animal = new Animal[4];
//		animal[0] = new Cat("Meow1");
//		animal[1] = new Cat("Meow2");
//		animal[2] = new Dog("Woof1");
//		animal[3] = new Dog("Woof2");
//		FileOutputStream fos = new FileOutputStream(file);
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		for (int i = 0; i < animal.length; i++)
//			oos.writeObject(animal[i]);
//		oos.close();
//		fos.close();
//		
//		//讀取
//		FileInputStream fis = new FileInputStream(file);
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		System.out.println(file.getName() + "檔案內容如下: ");
//		System.out.println("--------------------");
//		try {
//			while (true) {
//				((Animal) ois.readObject()).speak();
//				System.out.println("--------------------");
//			}
//		} catch (EOFException e) {
//			System.out.println("資料讀取完畢！");
//		}
//		ois.close();
//		fis.close();
//		
//	}
//}








