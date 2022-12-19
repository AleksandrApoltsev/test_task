package tasks.watch;

import static tasks.watch.FindAngle.findAngle;

public class AngleBetweenArrows {

    public static void main(String[] args) {
        int hours = 6;
        int minutes = 0;
        System.out.println("Angle between arrows: " + findAngle(hours, minutes));
    }
}