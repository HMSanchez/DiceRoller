package Roll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class dice {

	public static void run() {

		int num = prompt();
		roll(num);
 
}

	public static int prompt() {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to rolling dice");

		int num1 = 0;
		boolean valid = false;
		while (!valid)

			try {
				System.out.println("Please enter how many die or dice to roll");

				String input = readRacer.readLine();
				num1 = Integer.parseInt(input);
				valid = true;
			} catch (IOException e) {

			} catch (NumberFormatException nfe) {
				System.out.println("enter valid NUMBER");
				valid = false;
			}
		return num1;

	}

	public static void roll(int nums) {
		int in = 1;
		Random num = new Random();
		int[] array = new int[nums];
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			int randNum = num.nextInt(6) + 1;
			array[i] = randNum;

			System.out.println("the value of die" + " " + count++ + " " + "rolled was" + " " + array[i]);
		}

	     int min = Integer.MAX_VALUE; //or -1
	     int max = Integer.MIN_VALUE; //or -1
	    for(int i : array) { //if you need to know the index, use int (i=0;i<array.length;i++) instead
	        if(i < min) min = i; //or if(min == -1 || array[i] < array[min]) min = i; 
	        if(i > max) max = i;} //or if(max == -1 || array[i] > array[max]) max = i;
		 System.out.println("The maximum in the arr:" + max);
		System.out.println("The minimum in the arr:" + min  );
		double sum = 0;
		for (int s : array)
			sum += s;
		System.out.println("the sum of die/dice rolled is " + "=" + " " + (sum));

				
		double val = (sum/array.length) ;
		val = val*100;
		val = Math.round(val);
		val = val /100;
		System.out.println("the mean of all values is" + " " + "=" + " " + val);

		int maxValue = 0, maxCount = 0;

		for (in = 0; in < array.length; ++in) {
			count = 0;
			for (int f = 0; f < array.length; ++f) {
				if (array[f] == array[in])
					++count;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = array[in];
			}

		}

		System.out.println("mode is" + " " + maxValue);

	}
	
}
