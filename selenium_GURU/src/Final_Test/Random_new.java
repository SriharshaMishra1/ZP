package Final_Test;

import java.util.Random;

public class Random_new {

	public static void main(String[] args) {
		
		Random num= new Random();
		String customer="HDFC-"+num.nextInt(10000);
		System.out.println(customer);
	}
}
