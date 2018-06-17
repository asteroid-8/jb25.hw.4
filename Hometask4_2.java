import java.util.Scanner;

public class Hometask4_2 {
	
	public static void main(String[] args) {
		int A[], N = 0, K = 0, sum = 0;
		boolean flagN = false;
		boolean flagK = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("������� ����������� �������: ");
			if(sc.hasNextInt()) {
				N = sc.nextInt();
				if(N >= 0) {
					flagN = true;
				} else {
					System.out.println("\n�� ����� �� ����������� �����.\n");
				}
			} else {
				System.out.println("\n�� ����� �� ����������� �����.\n");
				sc.next();
			}
		} while(!flagN);
		
		A = new int[N];
		
		
		do {
			System.out.print("������� ����� �: ");
			if(sc.hasNextInt()) {
				K = sc.nextInt();
				flagK = true;
			} else {
				System.out.println("\n�� ����� �� ����� �����.\n");
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
		
		System.out.println("����� ���� ���������, ������� ������ ����� " + K + ", ����� " + sum + ".");
		
	}

}
