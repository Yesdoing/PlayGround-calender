import java.util.Scanner;

public class WhilePrintMonth {
	public static final int[] MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int result=0;

		while(result != -1) {
			System.out.println("달을 입력하세요.");
			result = scan.nextInt();
			if(result != -1) System.out.println(result + "월은 " + MONTH[result - 1] + "일까지 있습니다.");
		}
	}
}
