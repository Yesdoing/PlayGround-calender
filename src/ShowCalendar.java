import java.util.Scanner;

public class ShowCalendar {
	public static final int[] MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		
		while(true) {
			System.out.println("달을 입력하세요.");
			result = scan.nextInt();
			if(result == -1) break;
			printCalendar(result);
			System.out.println();
		}
	}
	
	private static void printCalendar(int result) {
		System.out.println("Hello Calendar!");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		for(int i = 1; i<=MONTH[result]; i++) {
			if(i < 10) System.out.print(" " + i + " ");
			else System.out.print(i + " ");
			
			if(i % 7 == 0) System.out.println();
		}
	}
}
