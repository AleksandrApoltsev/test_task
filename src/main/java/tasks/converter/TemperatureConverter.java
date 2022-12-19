package tasks.converter;

public class TemperatureConverter {
    public int converterTemp(int temperature, char convertTo) {
        switch (convertTo) {
            case 'F' -> temperature = (int) ((1.8 * temperature) + 32);
            case 'K' -> temperature = temperature + 273;
            default -> System.out.println("Data error");
        }
        return temperature;
    }
}
