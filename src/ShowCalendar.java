import java.util.Scanner;

public class ShowCalendar {
	public static final int[] MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public static void main(String[] args) {			
		while(inputMonth()) { 
			System.out.println();
		}
	}
		
	private static boolean inputMonth() {
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("달을 입력하세요.");
		int result = scan.nextInt();
		if(result == -1) return false;
		else printCalendar(result);
		
		return true;

	}
	
	private static void printCalendar(int result) {
		System.out.println("Hello Calendar!");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		for(int i = 1; i<=MONTH[result-1]; i++) {
			printDay(i);
		}
	}
	
	private static void printDay(int day) {
		if(day < 10) System.out.print(" " + day + " ");
		else System.out.print(day + " ");
		if(day % 7 == 0) System.out.println();
	}
}
