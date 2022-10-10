package currencydenomination;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class currencydemonation {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the currency denominations:");
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value:");
		Integer[] denominations = new Integer[size];
		for (int i = 0; i < size; i++) {
			denominations [i] = sc.nextInt();
		}
		Arrays.sort(denominations, Collections.reverseOrder());
		System.out.println("Enter the amount you want to pay:");
		int amount = sc.nextInt();
		sc.close();
		int i = 0;
		int[] currencyCount = new int [size];
		while (amount>0) {
			currencyCount [i] = amount/denominations[i];
			amount = amount - (denominations[i]*currencyCount[i]);
			i++;
		}
		for (int j = 0; j < size; j++) {
			System.out.println(denominations[j]+" : "+currencyCount[j]);
		}
		
	}
	
}
