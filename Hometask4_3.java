import java.util.Scanner;

public class Hometask4_3 {

	public static void main(String[] args) {
		String sequence = new String();
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		
			System.out.print("������� ����� ������ ������������������ �����: ");
			if(sc.hasNextLine()) {
				sequence = sc.nextLine();
			}
			
			//System.out.println("\n��������� ������: " + sequence + "\n");
			
			String array[] = sequence.split(" ");
			double num[] = new double[array.length];
			
			/*System.out.println("������������ ������: ");
			for(int i = 0; i < array.length; i++) {
				System.out.println("[ " + i + " ] = " + array[i]);
			}
			
			System.out.println("��������������� ������: ");*/
				
			for(int i = 0; i < array.length; i++) {
				num[i] = Double.parseDouble(array[i]);
				//System.out.println("[ " + i + " ] = " + num[i]);
			}
			
			for(int i = 0; i < num.length - 1; i++) {
				if (num[i] >= num[i+1]) {
					System.out.println("������������������ �� �������� ������������.");
					break;
				}
				if(num[i + 1] == num[num.length-1]) {
					System.out.println("������������������ �������� ������������.");
				}
			}
			
			
		
			
		
	}

}
