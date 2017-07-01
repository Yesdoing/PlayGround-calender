import java.util.Scanner;

public class printDayMonth {
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
		scan.nextLine();
		System.out.println("1일은 무슨 요일인가요?");
		String day = scan.nextLine();
		
		if(result == -1) return false;
		else printCalendar(result, day);
		
		return true;

	}
	
	private static void printCalendar(int result, String day) {
		System.out.println("Hello Calendar!");
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("--------------------");
		
		int indent = indentDay(day);
		
		for(int i=0; i<indent; i++) {
			System.out.print("   ");
		}
		
		for(int i = 1; i<=MONTH[result-1]; i++) {
			printDay(i, indent);
		}
	}
	
	private static void printDay(int day, int indent) {
		int result = indent + day;
		if(day < 10) System.out.print(" " + day + " ");
		else System.out.print(day + " ");
		if(result % 7 == 0) System.out.println();
	}

	private static int indentDay(String day) {
		switch (day) {
		case "일":
			return 0;
		case "월":
			return 1;
		case "화":
			return 2;
		case "수":
			return 3;
		case "목":
			return 4;
		case "금":
			return 5;
		case "토":
			return 6;
		default:
			return 0;
		}
	}
}
