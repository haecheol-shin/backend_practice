import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
//		int a = 2;
//		int b = 3;
//		for (int i=1; i<10; i++) {
//			System.out.println(a+"*"+i+"="+a*i);
//		}
//		System.out.println("----------");
//		for (int i=1; i<10; i++) {
//			System.out.println(b+"*"+i+"="+b*i);
//		}
//		
//		System.out.println("구구단 숫자 입력: ");
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		for(int i=1; i<10; i++) {
//			System.out.println(input+"*"+i+"="+input*i);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int input = 0;
//		while(input>9 || input<2) {
//			System.out.println("구구단 숫자 입력: ");
//			input = sc.nextInt();
//			
//			if(input>9 || input<2) {
//				System.out.println("잘못 입력하셨습니다.");
//			}
//			else {
//				for(int i=1; i<10; i++) {
//					System.out.println(input+"*"+i+"="+input*i);
//				}
//			}
//		}
		
		int[] result = new int[9];
		for(int i=0; i<8; i++) {
			result[i] = i+2;
			
			System.out.println("----"+result[i]+"단"+"----");
			for(int j=1;j<10;j++) {
				System.out.println(result[i]+"*"+j+"="+result[i]*j);
			}
		}
		
		
	}
	
	
}
 // ctrl + alt + 화살표: 한줄 복사