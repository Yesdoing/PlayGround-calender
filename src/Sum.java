import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수 를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] nums = input.split(" ");
		
		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[1]);
		int result = num1 + num2;
		System.out.println("두 수의 합은 " + result + "입니다.");
		
		
		
		
	}
}
