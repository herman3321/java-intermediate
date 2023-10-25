package SimpleLotterySoftware;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static final int NUMBERS =6;
    public static final int MAX_NUMBERS =40;
    public static final int PRIZE =100;
    public static void main(String[] args){
        //getting winning number and ticket sets
        Set<Integer> winning = createWinningNumbers();
        Set<Integer> ticket = getTicket();

        //keeping only winning numbers from user's ticket
        //using retainAll() to remove non common numbers
        Set<Integer> matches = new TreeSet<>(ticket);
        matches.retainAll(winning);

        System.out.println("Your ticket was: "+ticket);
        System.out.println("winning Numbers" +winning);

        if (matches.size() > 0){
            double prize = PRIZE * Math.pow(2, matches.size());
            System.out.println("Matched numbers "+ matches);
            System.out.printf("Your prize is $%.2f\n", prize);
        }
        else{
            System.out.println("Keep Playing!!!");
        }
    }
    

    //generates a set of winning lotto numbers
        public static Set<Integer> createWinningNumbers(){
            Set<Integer> winning = new TreeSet<>();
            Random random = new Random();
            while (winning.size() < NUMBERS){
                int number = random.nextInt(MAX_NUMBERS);
                winning.add(number);
            }
            return winning;
        }

    //reading player's lottery ticket from consol
        public static Set<Integer> getTicket(){
            Set<Integer> ticket = new TreeSet<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter" +NUMBERS+ " Lotto numbers");
            while(ticket.size() < NUMBERS){
                int number = scanner.nextInt();
                if(number <= MAX_NUMBERS){
                    ticket.add(number);
                }
            }
            return ticket;
        }

    
    
}
