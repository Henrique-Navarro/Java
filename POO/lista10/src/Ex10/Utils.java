package Ex10;

public class Utils {
	public static void main(String[] args) {
		double fahrenheit=400;

		try {
			if(fahrenheit>-459.67) {
				throw new FahrenheitException();
			}
			double celcius = toCelcius(fahrenheit);
			System.out.println(fahrenheit+"°F -> "+celcius+"°C");
		}
		catch (FahrenheitException e) {
			e.printStackTrace();
		}
	}

	public static double toCelcius(double fahrenheit) throws FahrenheitException{
		return (5*(fahrenheit-32))/9;
	}
}