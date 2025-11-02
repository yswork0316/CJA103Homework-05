package hw5;

import java.util.Scanner;

//1.請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如圖：
//public class Hw5 {
	
//	public static void starSquare(int width, int height) {
//		for(int i = 0; i < height; i++) {
//			for(int j = 0; j < width; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("請輸入寬與高:");
//		Scanner sc = new Scanner(System.in);
//		int width = sc.nextInt();
//		int height = sc.nextInt();
//		
//		starSquare(width, height);	
//	}	
//}


//2.請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
//public class Hw5 {
//	
//	public static void randAvg(int number) {
//		double sum = 0;
//		double avg;
//		int randInt;
//		for(int i = 0; i < number; i++) {
//			randInt = (int) (Math.random() * 101);
//			System.out.print(randInt + " ");
//			sum += randInt;
//		}
//		
//		avg = sum / number;
//		System.out.println();
//		System.out.printf("%.1f",avg);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("請輸入亂數的個數:");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		randAvg(number);
//	}
//	
//}


//3.利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳，如圖：

//public class Hw5 {
//	
//	public static int maxElement(int[][] intArray) {
//		
//		int max = intArray[0][0];
//		for(int i = 0; i < intArray.length; i++) {
//			for(int j = 0; j < intArray[i].length; j++) {
//				if(max < intArray[i][j]) {
//					max = intArray[i][j];
//				}
//			}
//		}
//		return max;
//	}
//	
//	public static double maxElement(double[][] intArray) {
//		
//		double max = intArray[0][0];
//		for(int i = 0; i < intArray.length; i++) {
//			for(int j = 0; j < intArray[i].length; j++) {
//				if(max < intArray[i][j]) {
//					max = intArray[i][j];
//				}
//			}
//		}
//		return max;
//	}
//	
//	public static void main(String[] args) {
//		int[][] intArray = {{1,6,3},{9,5,2}};
//		double[][] doubleArray = {{1.2, 3.5, 2.2},{7.4, 2.1, 8.2}};
//		
//		System.out.println(maxElement(intArray));
//		System.out.println(maxElement(doubleArray));
//	}
//}


//4.請設計一個類別MyRectangle：
//(1) 有兩個double型態的屬性為width, depth
//(2) 有三個方法：
//void setWidth(double width):       //將收到的引數指定給width屬性
//void setDepth(double depth):       //將收到的引數指定給depth屬性
//double getArea():                  //能計算該長方形的面積
//(3) 有兩個建構子：
//public MyRectangle():              //不帶參數也無內容的建構子
//public MyRectangle(double width, double depth):              //傳入的兩個引數會指定給對應的屬性
//請另外建立一個MyRectangleMain類別，此類別只有main方法
//(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//public class Hw5 {
//	public static void main(String[] args) {
//		MyRectangle rt = new MyRectangle();
//		rt.setWidth(10);
//		rt.setdepth(20);
//		System.out.println(rt.getArea());
//		
//		MyRectangle rt2 = new MyRectangle(10,20);
//		System.out.println(rt2.getArea());
//	}
//}

//5.身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合，如圖：

public class Hw5 {
	public static void genAuthCode() {
		String content = "abcdefghijklmnopqrstubwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] chararray = content.toCharArray();
		int randIndex;
		for(int i = 0; i < 8; i++) {
			randIndex = (int) (Math.random() * chararray.length);
			System.out.print(chararray[randIndex]);
		}
	}
	
	
	public static void main(String[] args) {
		genAuthCode();
	}
}







