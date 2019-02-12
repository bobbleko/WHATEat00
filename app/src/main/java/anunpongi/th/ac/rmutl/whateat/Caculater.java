package anunpongi.th.ac.rmutl.whateat;

import android.support.annotation.ArrayRes;

import java.util.ArrayList;

public class Caculater {
    public static void Caculater(int Stature , int Age ,int Kg ,int GanderText) {

        if (GanderText == 1) {
            caculater =  66 + (13.7 * Kg) + (5 * Stature) - (6.8 * Age);


        } else {
            caculater =  665 + (9.6 * Kg) + (1.8 * Stature) - (4.7 * Age);

        }


    }

    public static ArrayList <Integer> Allnum = new ArrayList <>(  );

    public static Double caculater = 0.0 ;

    public static void iscaculater(int Varylow , int Low ,int Medium , int High) {

        if (true) {
            caculater = Varylow * 1.2;

        } else if (false) {
            caculater = Low * 1.375;

        } else if (false){
            caculater = Medium * 1.725;

        } else if (false) {
            caculater = High * 1.9;
        }

    }

    public static ArrayList <Integer> finish = new ArrayList <>();
    public static Double iscaculater = 0.0;
    public static void caculater(int parseInt , int parseInt1) {
    }
}
