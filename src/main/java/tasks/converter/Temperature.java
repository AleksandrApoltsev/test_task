package tasks.converter;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args)  {
        TemperatureConverter myTemp = new TemperatureConverter();
        Scanner in = new Scanner(System.in);
        System.out.print("Input t Celsius: ");
        int temperature = in.nextInt();
        System.out.print("Select converter (F or K): ");
        char convertTo = in.next().charAt(0);
        int temperatureNow = myTemp.converterTemp(temperature,convertTo);
        System.out.println(temperatureNow);
    }
}