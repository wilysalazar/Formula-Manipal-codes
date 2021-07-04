import java.util.Scanner;

interface temperaturelmd {
    public float temp(float t);
}

public class lmd {
    public static void main(String[] args) {
        System.out.println("enter temperature in fahrenheit scale- ");
        Scanner scan = new Scanner(System.in);


        temperaturelmd temperature = (float temp)->{
            System.out.println("the temperature in celsius scale is- " + ((temp-32)*5)/9);
            return 0;
        };
        float celsiusTemp = scan.nextFloat();
        temperature.temp(celsiusTemp);
    }
}
