package tasks.converter;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        System.out.print("Input t Celsius: ");
        int temperature = in.nextInt();

        System.out.print("Select converter (F or K): ");
        char convertTo = in.next().charAt(0);

        TemperatureConverter myTemp = new TemperatureConverter();
        int temperatureNow = myTemp.converterTemp(temperature,convertTo);
        System.out.println(temperatureNow);
    }
}