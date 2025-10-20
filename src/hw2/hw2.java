package hw2;


// 1.請建立一個TestNineNine.java程式，可輸出九九乘法表
//使用for+while迴圈
public class hw2 {
	public static void main(String[] args) {
		int i,j;
		for( i = 1; i <= 9; i++) {
			j = 1;
			while(j <= 9) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
				j += 1;
			}
			System.out.println();
		}
	}
}	
//--------------------------------------------------------------------
//使用for+do while迴圈	
//public class hw2 {
//	public static void main(String[] args) {		
//		int i,j;
//		for( i = 1; i <= 9; i++) {
//			j = 1;
//			do{
//				System.out.print(i+"*"+j+"="+(i*j)+"\t");
//				j += 1;
//			}
//			while(j <= 9);
//			System.out.println();
//		}
//	}
//}	

//--------------------------------------------------------------------

//public class hw2 {
//	public static void main(String[] args) {
//使用while+do while迴圈
//		int i = 1;
//		while(i <= 9) {
//			int j = 1;
//			do{
//				System.out.print(i+"*"+j+"="+(i*j)+"\t");
//				j += 1;
//			}
//			while(j <= 9);
//			System.out.println();
//			i += 1;
//		}
//	}
//}	

//--------------------------------------------------------------------

//2.請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
//public class hw2{
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i = 2; i <= 1000; i+=2) {
//			sum += i;
//		}
//		System.out.println(sum);
//	}
//}

//--------------------------------------------------------------------

//3.請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)

//public class hw2{
//	public static void main(String[] args) {
//		int product = 1;
//		for(int i = 2; i <= 10; i++) {
//			product *= i;
//		}
//		System.out.println(product);
//	}
//}

//--------------------------------------------------------------------

//4.請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)

//public class hw2{
//	public static void main(String[] args) {
//		int product = 1;
//		int i = 2; 
//		while(i <= 10) {
//			product *= i;
//			i += 1;
//		}
//		System.out.println(product);
//	}
//}

//--------------------------------------------------------------------

//5.請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100

//public class hw2{
//	public static void main(String[] args) {
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i*i+" ");
//		}
//	}
//}

//--------------------------------------------------------------------

//6.阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

//public class hw2 {
//	public static void main(String[] args) {
//		for(int i = 1; i <= 49; i++) {
//			if(i % 10 == 4) {
//				continue;
//			}
//			if(i >= 40) {
//				break;
//			}
//			System.out.print(i + " ");
//		}
//	}
//}

//--------------------------------------------------------------------

//7.請設計一隻Java程式，輸出結果為以下：
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6 
//1 2 3 4 5
//1 2 3 4 
//1 2 3 
//1 2 
//1

//public class hw2 {
//	public static void main(String[] args) {
//		for(int i = 10; i >= 1; i--) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//	}
//}

//--------------------------------------------------------------------

//8.請設計一隻Java程式，輸出結果為以下：
// A
// BB
// CCC
// DDDD
// EEEEE
// FFFFFF

//public class hw2{
//	public static void main(String[] args) {
//		int alphabet = 65;
//		for(int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print((char)alphabet);
//			}
//			System.out.println();
//			alphabet += 1;
//		}
//	}
//}








