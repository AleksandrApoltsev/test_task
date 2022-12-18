package tasks;

public class RandomNumbers {
    public static void main(String[] args) {

        int n = 100;
        double[] numbers = new double[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }

        double max = numbers[0];
        double min = numbers[0];
        double avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i];
            if (min > numbers[i])
                min = numbers[i];
            avg += numbers[i] / numbers.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}