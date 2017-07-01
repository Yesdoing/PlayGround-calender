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
		int indent = 0;
		switch (day) {
		case "일":
			indent = 0;
			break;
		case "월":
			indent = 1;
			break;
		case "화":
			indent = 2;
			break;
		case "수":
			indent = 3;
			break;
		case "목":
			indent = 4;
			break;
		case "금":
			indent = 5;
			break;
		case "토":
			indent = 6;
			break;
		}
		return indent;
	}
}
