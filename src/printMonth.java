import java.util.Scanner;

public class printMonth {
	public static final int[] MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("달을 입력하세요.");
		int result = scan.nextInt();
		
		System.out.println(result + "월은 " + MONTH[result-1] + "일까지 있습니다.");
		
	}
}
