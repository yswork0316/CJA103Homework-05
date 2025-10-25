package hw3;
import java.util.Arrays;
import java.util.Scanner;


//1.請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：
//(進階功能：加入直角三角形的判斷) 

//public class hw3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] t = new int[3];
//		System.out.println("請輸入三個整數:");
//		
//		for(int i=0; i<3; i++) {
//			t[i] = sc.nextInt(); 
//		}
//		
//		Arrays.sort(t);
//		
//		if((t[0]+t[1]) > t[2]) {
//			if((t[0] == t[1]) && t[0]== t[2]) {
//				System.out.println("正三角形");
//			}
//			else if(t[0] == t[1] || t[0] == t[2] || t[1] == t[2]){
//				System.out.println("等腰三角形");
//			}
//			else {
//				System.out.println("其他三角形");
//			}
//			
//			if(t[0]*t[0] + t[1]*t[1] == t[2]*t[2]) {
//				System.out.println("也是直角三角形");     
//			}
//		}
//		else {
//			System.out.println("不是三角形");
//		}
//	}
//}

//================================================================================

//2.請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)

//public class hw3 {
//	public static void main(String[] args) {
//		System.out.println("開始猜數字吧!(0~100)");
//		Scanner sc = new Scanner(System.in);
//		int n = (int) (Math.random()*101);
//		int A = sc.nextInt();
//		
//		while (A != n) {
//			System.out.println("猜錯囉");
//			if(A > n) {
//				System.out.println("大於正確答案");
//			}
//			else {
//				System.out.println("小於正確答案");
//			}
//			
//			A = sc.nextInt();
//		}
//		System.out.println("答對了!答案就是" + A);
//	}
//}

//================================================================================
/*3-1阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
的號碼與總數，如圖： */
//public class hw3 {
//	public static void main(String[] args) {
//		System.out.println("阿文...請輸入你討厭哪個數字?");
//		Scanner sc = new Scanner(System.in);
//		int hatenumber = sc.nextInt();
//		
//		for(int i = 1; i <= 49; i++) {
//			if(i % 10 == hatenumber || (i >= hatenumber*10 && i < (hatenumber*10+10))) {
//			continue;
//			}
//		
//		System.out.print(i + " ");
//		}
//	}
//}
//================================================================================
//3-2 (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複) 
//方法一:建一個長度為6的陣列，另外寫一個方法檢視隨機數字是否已經在陣列中，不在陣列中且不含討厭數字的隨機數字才依序填入陣列中，並列印出來。

//public class hw3 {
//	public static void main(String[] args) {
//		System.out.println("阿文...請輸入你討厭哪個數字?");
//		Scanner sc = new Scanner(System.in);
//		int hatenumber = sc.nextInt();
//		int[] choose_number = new int[6];
//		
//		for(int i = 0; i < 6; i++) {
//			int rand_number = (int) (Math.random()*49+1);
//			while(i >= 0){
//				boolean isfound = hw3.isfound(choose_number, rand_number);
//				if(rand_number % 10 == hatenumber || (rand_number >= hatenumber*10 && rand_number < (hatenumber*10+10)) || isfound == true) {
//					rand_number = (int) (Math.random()*49+1);
//				}
//				else {
//					choose_number[i] = rand_number;
//					break;
//				}
//			}
//			System.out.print(choose_number[i] + " ");
//		}
//	}
//	
//	
//	
//	public static boolean isfound(int[] arrays,int rand_number) {
//		for(int number : arrays) {
//			if( number == rand_number) {
//				return true;
//			}
//		}	
//		return false;
//	}
//}


//================================================================================
//3-2 (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複) 
//方法二:建一個長度為49的陣列，先依序填入1-49，再以隨機的index將號碼抽出，抽出後將index的數值改為0，若抽出的數值為0則重抽

//public class hw3 {
//	public static void main(String[] args) {
//		System.out.println("阿文...請輸入你討厭哪個數字?");
//		Scanner sc = new Scanner(System.in);
//		int hatenumber = sc.nextInt();
//		int[] number = new int[49];
//		
//		for(int i = 0; i < 49; i++) {
//			number[i] = i + 1;
//		}
//		
//		for(int i = 0; i < 6; i++) {
//			int rand_index = (int) (Math.random()*49);
//			
//			while(i >= 0) {
//				if(number[rand_index] % 10 == hatenumber || (number[rand_index] >= hatenumber*10 && number[rand_index] < (hatenumber*10+10)) || number[rand_index] == 0) {
//					rand_index = (int) (Math.random()*49);
//				}
//				else {
//					System.out.print(number[rand_index] + " ");
//					number[rand_index] = 0;
//					break;
//				}
//			}
//		}
//	}
//}














