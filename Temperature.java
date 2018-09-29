
import java.util.Scanner;

//converts a Fahrenheit degree to Celsius using the formula:  (5/9) * (farenheit-32)
public class Temperature {

	public static void main(String[] args) {
		
		double temperature = 0.0;
		double celsius=0;
		System.out.print("Enter the temperature in fahrenheit: ");
		Scanner inputScanner = new Scanner(System.in);
		temperature = inputScanner.nextDouble();
		inputScanner.close();
		celsius = (temperature - 32.0) * (5.0/9.0) ;                          
		System.out.print(temperature + " in celsius is: " + celsius);
		

	}

}
