package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUM = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i = 0; i < LENGTH; i++){
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUM) + 1;
            }while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find th value
     * @param array Array to search through
     * @param numToSearchFor Value to search for
     * @return true if found, false if not
     * */

    public static boolean search(int[] array, int numToSearchFor){
        for(int value : array){
            if(value == numToSearchFor){
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] array, int numToSearchFor){
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numToSearchFor);
        if(index >= 0){
            return true;
        }else{
            return false;
        }
    }

    public static void printTicket(int ticket[]){
        for(int i = 0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
