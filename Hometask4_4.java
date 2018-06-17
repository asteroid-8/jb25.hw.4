import java.util.Scanner;

public class Hometask4_4 {
	public static void main(String[] args) {
		String sequence = new String();
		int count = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		
			System.out.print("Введите через пробел последовательность чисел: ");
			if(sc.hasNextLine()) {
				sequence = sc.nextLine();
			}
			
			
			String array[] = sequence.split(" ");
			double num[] = new double[array.length];
			
			
				
			for(int i = 0; i < array.length; i++) {
				num[i] = Double.parseDouble(array[i]);
			}
			
			for(int i = 0; i <num.length; i++) {
				if(num[i] == 0) {
					count++;
				}
			}
			
			double zero[] = new double[count];
			
			int index = 0;
			for(int i = 0; i < num.length; i++) {
				if(num[i] == 0) {
					zero[index] = i;
					index++;
				}
			}
			
			System.out.println("Массив номеров нулевых элементов:");
			for(int i = 0; i < zero.length; i++) {
				System.out.println("[ " + i + " ] = " + zero[i]);
			}
			
			
		
			
		
	}

}
