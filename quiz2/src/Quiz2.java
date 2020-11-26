
public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.
			System.out.println("1.");
		
		// For
			System.out.println("For :");
			int max = 5;
			for (int n = 1; n <= max; n++) {
				System.out.println(n);
			}
			System.out.println();
		
		//While
			System.out.println("While :");
			int max2 = 5;
			int n = 1;
			while (n <= max2) {
				System.out.println(n);
				n++;
			}
		
		System.out.println();
		
		// 2.
			System.out.println("2.");
			
		// For	
			System.out.println("For :");
			int total = 25;
			for (int number = 1; number <= (total / 2); number++) {
				total = total - number;
				System.out.println(total + " " + number);
			}
			System.out.println();
		
		// While
			System.out.println("While :");
			int total2 = 25;
			int number2 = 1;
			while (number2 <= total2 / 2) {
				total2 = total2 - number2;
				System.out.println(total2 + " " + number2);
				number2++;
			}
			
		System.out.println();	
			
		// 3.
			System.out.println("3.");
			
		// For
			System.out.println("For :");
			for (int i = 1; i <= 2; i++) {
				for (int j = 1; j <= 3; j++) {
					for (int k = 1; k <= 4; k++) {
						System.out.print("*");
					}
					System.out.print("!");
				}
				System.out.println();
			}
			System.out.println();
			
		// While
			System.out.println("While :");
			int i = 1;
			while(i <= 2) {
				int j = 1;
				while (j <= 3) {
					int k = 1;
					while (k <= 4) {
						System.out.print("*");
						k++;
					}
					System.out.print("!");
					j++;
				}
				System.out.println();
				i++;
			}
			
		System.out.println();
			
		// 4.
			System.out.println("4.");
			
		// For
			System.out.println("For :");
			int number = 4;
			for (int count = 1; count <= number; count++) {
				System.out.println(number);
				number = number / 2;
			}
			
		System.out.println();
			
		// While
			System.out.println("While :");
			int number3 = 4;
			int count = 1;
			while (count <= number3) {
				System.out.println(number3);
				number3 = number3 / 2;
				count++;
			}
			
	}

}
