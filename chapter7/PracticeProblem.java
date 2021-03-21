package chapter7;

import java.util.Scanner;

public class PracticeProblem {
    private static String week[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        week = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Enter number for day of the week");
        System.out.println(returnDay(scanner.nextInt()));;
    }

    public static String returnDay(int day){
        for(int i = 1; i <= week.length; i++){
            if(day == i){
                return week[i-1];
            }
        }
        return "Invalid number";
    }
}
