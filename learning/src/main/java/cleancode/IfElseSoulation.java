package cleancode;

import jdk.nashorn.internal.objects.annotations.Function;

import java.util.HashMap;

public class IfElseSoulation {

    private double calculate(float income){
        double tax = 0;
        if (income <=2200) {
            tax = 0;
        } else if (income <= 2700) {
            tax = 0.14 * (income - 2200);
        } else if (income <= 3200) {
            tax = 70 + 0.15 * (income - 2700);
        } else if (income <= 3700) {
            tax = 145 + 0.16 * (income - 3200);
        } else {
            tax = 53090 + 0.7 * (income - 102200);
        }
        return tax;
    }
    private double calculateVone(float income){
        double tax = 0;
//        Map<Float, Function<Float>> actionMappings = new HashMap<>();
//        actionMappings.put();
        return tax;
    }

    public static void main(String[] args) {

        System.out.printf("");
    }
}
