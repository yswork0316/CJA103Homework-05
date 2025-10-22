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
/*3.阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
的號碼與總數，如圖： (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)*/
public class hw3 {
	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字?");
		Scanner sc = new Scanner(System.in);
		int hatenumber = sc.nextInt();
		
		for(int i = 1; i <= 49; i++) {
		if(i % 10 == hatenumber || (i >= hatenumber*10 && i < (hatenumber*10+10))) {
			continue;
			}
		
		System.out.print(i + " ");
		}
	}
}




















