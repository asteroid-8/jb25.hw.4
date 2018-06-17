import java.util.Scanner;

public class Hometask4_2 {
	
	public static void main(String[] args) {
		int A[], N = 0, K = 0, sum = 0;
		boolean flagN = false;
		boolean flagK = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Введите размерность массива: ");
			if(sc.hasNextInt()) {
				N = sc.nextInt();
				if(N >= 0) {
					flagN = true;
				} else {
					System.out.println("\nВы ввели не натуральное число.\n");
				}
			} else {
				System.out.println("\nВы ввели не натуральное число.\n");
				sc.next();
			}
		} while(!flagN);
		
		A = new int[N];
		
		
		do {
			System.out.print("Введите число К: ");
			if(sc.hasNextInt()) {
				K = sc.nextInt();
				flagK = true;
			} else {
				System.out.println("\nВы ввели не целое число.\n");
				sc.next();
			}
		} while(!flagK);
		
		
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * (N + 1));
			if (A[i] % K == 0) {
				sum += A[i];
			}
		}
		
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("A[" + i + "] = " + A[i]);
		}
		
		System.out.println("Сумма всех элементов, которые кратны числу " + K + ", равна " + sum + ".");
		
	}

}
