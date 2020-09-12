package chapter7;
//create a Lottery Quick Pick application that will generate a lottery ticket with 6 random numbers, between 1 and 69

import java.util.Random;

public class LotteryTicket {

    static final int LENGTH = 6;
    static final int MAXIMUM_NUMBER =69;

    public static void main(String[] args) {
    int[] tickets = generateNumbers();
    printTickets(tickets);

    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i< LENGTH; i++){
            ticket[i]= random.nextInt(MAXIMUM_NUMBER)+1;
            
        }
return ticket;
        
    }

    public static void printTickets(int[]tickets){
        for (int i= 0; i<LENGTH; i++)
        System.out.print(tickets[i]+ "|");
    }

}
