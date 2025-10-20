package hw1;

//1.請設計一隻Java程式，計算12，6這兩個數值的和與積
public class hw1 {
	public static void main(String[] args) {
		int a = 12;
		int b = 6;
		System.out.println("和是"+ (a+b));
		System.out.println("積是"+ (a*b));
 	}
}

//--------------------------------------------------------

//2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
//public class hw1 {
//	public static void main(String[] args) {
//		int a = 200%12;
//		int b = (200-a)/12;
//		System.out.println(b+"打"+a+"顆");
// 	}
//}

//--------------------------------------------------------

//3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒

//public class hw1 {
//	public static void main(String[] args) {
//		int t = 256559;
//		int a = t%60;                            //秒
//		int b = ((t-a)/60)%60;                   //分
//		int c = ((t-a-b*60)/60/60)%24;           //時
//		int d = (t-a-b*60-c*60*60)/(60*60*24);   //天
//		
//		System.out.println(d+"天"+c+"小時"+b+"分"+a+"秒");
// 	}
//}

//256559秒 -> 4275分鐘59秒 -> 71小時15分鐘59秒 -> 2天23小時15分鐘59秒

//--------------------------------------------------------

//4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長

//public class hw1 {
//	public static void main(String[] args) {
//		final double PI = 3.1415;
//		double r = 5;
//		double area = PI*r*r;
//		double cir=2*PI*r;
//		System.out.printf("圓面積 = %.2f%n", area);
//		System.out.printf("圓周長 = %.2f%n", cir);
// 	}
//}

//--------------------------------------------------------

//5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google)

//public class hw1 {
//public static void main(String[] args) {
//	double deposit = 150;
//	double rate = 0.02;
//	double deposit2 = deposit * Math.pow(1+rate, 10); 
//	System.out.printf("本金加利息 = %.2f 萬元%n", deposit2);
//	}
//}


//--------------------------------------------------------

//6.請寫一隻程式，利用System.out.println()印出以下三個運算式結果：5 + 5;5 + ‘5’;5 + “5”，並請用註解各別說明答案的產生原因

//public class hw1 {
//public static void main(String[] args) {
//	System.out.println(5 + 5);       //10。數字相加
//	System.out.println(5 + '5');     //58。5是int，'5'是char，兩個相加時char提升為int，'5'的ASCII是53，所以相加等於58
//	System.out.println(5 + "5");     //55。"5"是字串，兩個相加時會變成字串串連。
//	}
//}













