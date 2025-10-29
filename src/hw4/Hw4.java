package hw4;

import java.util.Scanner;

//1. 有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一支程式能輸出此陣列所有元素的平均值與大於平均值的元素

public class Hw4 {
	public static void main(String[] args) {
		int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		int average;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		average = sum / array.length;
		System.out.println("平均值:" + average);
		
		System.out.println("大於平均值的元素有:");
		for (int i = 0; i < array.length; i++) {
			if(array[i] > average) {
				System.out.print(array[i] + " ");
			}
		}
	}
}

//2.請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH
//作法: 將字串利用toCharArray()轉換為字元陣列後，將每個字元依照反過來的index依序填入另一個字元陣列。


//public class Hw4 {
//	public static void main(String[] args) {
//		String s = "Hello World";
//		char[] array = s.toCharArray();
//		char[] arrayReverse = new char[array.length];
//		int index = 0;
//		
//		for(int i = array.length - 1; i >= 0 ; i-- ) {
//			arrayReverse[index++] = array[i];
//		}
//		
//		for(int i = 0; i < array.length; i++)
//			System.out.print(arrayReverse[i]);
//	}
//}


//3.有個字串陣列如下(八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//作法: 將字串陣列中的元素用for迴圈各別取出元素並串連成一個字串，再利用toCharArray()轉換為字元陣列後即可用for迴圈依序取出所有字母，並檢視母音的數量。


//public class Hw4 {
//	public static void main(String[] args) {
//		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//		String str ="";
//		int count = 0;
//		
//		for(int i = 0; i < planets.length; i++) {
//			str = str + planets[i]; 
//		}
//		
//		char[] array = str.toCharArray();
//		
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] == 'a' || array[i] == 'e' ||array[i] == 'i' ||array[i] == 'o' ||array[i] == 'u') {
//				count += 1;
//			}
//			
//		}
//		System.out.println(count);
//	}
//}

//4.阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
//表如下：
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//員工編號: 25 19 27 共3 人!」
//作法一: 二維陣列

//public class Hw4 {
//	public static void main(String[] args) {
//		System.out.println("請輸入欲借的金額:");
//		Scanner sc = new Scanner(System.in);
//		int borrowAmount = sc.nextInt();
//		int count = 0;
//		
//		int[][] colleagues = {{25,2500},{32,800},{8,500},{19,1000},{27,1200}};
//		
//		System.out.print("有錢可借的員工編號: ");
//		for(int i = 0; i < 5; i++) {
//			if(colleagues[i][1] >= borrowAmount) {
//				count += 1;
//				System.out.print(colleagues[i][0] + " ");
//			}
//		}
//		System.out.print("共 "+ count + " 人!");
//	}
//}


//4. 作法二: 物件的一維陣列
//public class Hw4 {
//	private int empId;
//	private int money;
//	
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	
//	public int getMoney() {
//		return money;
//	}
//	public void setMoney(int money) {
//		this.money = money;
//	}
//	
//	public Hw4(int empId, int money) {
//		this.empId = empId;
//		this.money = money;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("請輸入欲借的金額:");
//		Scanner sc = new Scanner(System.in);
//		int borrowAmount = sc.nextInt();
//		int count = 0;
//		
//		Hw4[] emp = new Hw4[5];
//		emp[0] = new Hw4(25,2500);
//		emp[1] = new Hw4(32,800);
//		emp[2] = new Hw4(8,500);
//		emp[3] = new Hw4(19,1000);
//		emp[4] = new Hw4(27,1200);
//		
//		System.out.print("有錢可借的員工編號: ");
//		for(int i = 0; i < emp.length; i++) {
//			if(emp[i].getMoney() >= borrowAmount) {
//				count += 1;
//				System.out.print(emp[i].getEmpId() + " ");
//			}
//		}
//		System.out.print("共 "+ count + " 人!");
//	}
//}

//5.請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//作法: 用if判斷是否為閏年後，建立長度為12(對應12個月)的陣列，填入各個月份的天數，依據輸入的月份，用for迴圈從1月開始加總到(mm月-1)月，再加上dd日。


//public class Hw4 {
//	public static void main(String[] args) {
//		System.out.println("請輸入三個整數，分別代表西元yyyy年，mm月，dd日: ");
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
//		int month = sc.nextInt();
//		int day = sc.nextInt();		
//		int dayCount = 0;
//		
//		if( year % 4 == 0) {
//			int[] numberOfDays = {31,29,31,30,31,30,31,31,30,31,30,31};
//			
//			while( day > numberOfDays[month-1]) {
//				System.out.println("請重新輸入dd日");
//				day = sc.nextInt();
//			}
//			
//			
//			for(int i = 0; i < (month-1); i++) {
//				dayCount += numberOfDays[i];
//			}
//			dayCount += day;
//			
//			System.out.println("「輸入的日期為該年第 " + dayCount + " 天」" );
//		}
//		
//		else {
//			int[] numberOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};
//			
//			while( day > numberOfDays[month-1]) {
//				System.out.println("請重新輸入dd日");
//				day = sc.nextInt();
//			}
//			
//			for(int i = 0; i < (month-1); i++) {
//				dayCount += numberOfDays[i];
//			}
//			dayCount += day;
//			
//			System.out.println("「輸入的日期為該年第 " + dayCount + " 天」" );
//		}
//	}
//}

//6.班上有8位同學，他們進行了6次考試結果如下：請算出每位同學考最高分的次數
//作法:建立一個二維陣列填入各次考試中同學的分數(第一層:6次考試、第二層:8個同學的分數/index對應到學號-1)。找出各次考試的最高分，再找出最高分是位於第二層的哪個index，並同時在highestScoreCount陣列的該index計算次數。
//public class Hw4 {
//	public static void main(String[] args) {
//		int[][] scoreByQuiz = {{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},{100,70,79,90,75,70,79,90},{77,95,70,89,60,75,85,89},{98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75}};
//		int[] highestScoreCount = {0,0,0,0,0,0,0,0};
//		int maxScore;
//		
//		for(int i = 0; i < scoreByQuiz.length; i++) {
//			maxScore = scoreByQuiz[i][0];
//			for(int j = 1; j < scoreByQuiz[i].length; j++) {
//				if(scoreByQuiz[i][j] > maxScore) {
//					maxScore = scoreByQuiz[i][j];
//				}		
//			}
//			for(int j = 0; j < 8; j++) {
//				if(maxScore == scoreByQuiz[i][j]) {
//					highestScoreCount[j] += 1;
//				}
//			}
//		}
//		
//		for(int i = 0; i < highestScoreCount.length; i++) {
//			System.out.println((i+1) + " 號同學考最高分的次數為 " + highestScoreCount[i] + " 次");
//		}
//	}		
//}
	

