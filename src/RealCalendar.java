import java.util.Scanner;

public class RealCalendar {
	public static final int[] MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		
		while (inputCalendar()) {
			System.out.println();
		}

	}
	
	private static boolean inputCalendar() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요.");
		int year = scan.nextInt();
		if(year == -1) return false;
		
		System.out.println("월을 입력하세요.");
		int month = scan.nextInt();
		
		printCalendar(year, month);
		
		return true;
	}
	
	private static void printCalendar(int year, int month) {
		int indent = calculateDay(year, month);
		
		System.out.println("Hello Calendar!");
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("--------------------");
		
		for(int i=0; i<indent; i++) {
			System.out.print("   ");
		}
		
		for(int i = 1; i<=MONTH[month-1]; i++) {
			printDay(i, indent);
		}

	}

	private static void printDay(int day, int indent) {
		int result = indent + day;
		if(day < 10) System.out.print(" " + day + " ");
		else System.out.print(day + " ");
		if(result % 7 == 0) System.out.println();
	}

	
	private static int calculateDay(int year, int month) {
		int allday = (year - 1)*365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

		for (int i = 0; i < month-1; i++) {
			allday += MONTH[i];
		}

		if ((year % 4) == 0 && (year % 100) != 0 && (year % 400) == 0 && month > 1) {
			allday += 1;
		}

		int result = (allday+1) % 7 ;

		return result;
	}
}
