package anunpongi.th.ac.rmutl.whateat;

import java.util.ArrayList;

public class Caculater {

    public static ArrayList<Integer> Allnum = new ArrayList<>();
    public static Double dailyEnergy = 0.0;
    public static Double dailyActivityEnergy = 0.0;


    public static void calculateDaily(int Stature, int Age, int Kg, int GanderText, int activityNum) {
        if (GanderText == 1) {
            dailyEnergy = 66 + (13.7 * Kg) + (5 * Stature) - (6.8 * Age);
        } else {
            dailyEnergy = 665 + (9.6 * Kg) + (1.8 * Stature) - (4.7 * Age);
        }

        if (activityNum == 0) {
            dailyActivityEnergy = dailyEnergy * 1.2;
        } else if (activityNum == 1) {
            dailyActivityEnergy = dailyEnergy * 1.375;
        } else if (activityNum ==2) {
            dailyActivityEnergy = dailyEnergy * 1.55;
        } else if (activityNum == 3) {
            dailyActivityEnergy = dailyEnergy * 1.725;
        } else {
            dailyActivityEnergy = dailyEnergy * 1.9;
        }

    }

    public static void calculateDaily(int parseInt , int parseInt1 , int parseInt2) {

    }
}
