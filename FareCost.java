import java.util.Arrays;

public class TransitCalculator {

    // tracking fields
    int numberOfDays;
    int ridesPerDay;
    String[] ticketType = {"Pay-per-ride", "Seven-day-unlimited-rides", "Thirty-day-unlimited-rides"};
    double[] priceOfTicket = {2.75, 33.00, 127.00};

    public TransitCalculator(int numDays, int ridesPDay){
        if (numDays <= 0 || numDays > 30 || ridesPDay <= 0 ) {
            System.out.println("You've entered an invalid number of days or rides");
        } else
            numberOfDays = numDays;
        ridesPerDay = ridesPDay;
    }

    public double unlimited7Price(){
        int ticketsRequired = numberOfDays/7;
        if(numberOfDays%7>0) ticketsRequired++;
        double selectionBCost = ticketsRequired * priceOfTicket[1];
        return selectionBCost;
    }

    public double[] getRidePrices() {
        double selectionCost[] = {ridesPerDay*priceOfTicket[0], unlimited7Price(), priceOfTicket[2]};
        return selectionCost;
    }

    public String getBestFare() {
        int num = 0;
        for (int i=1; i<3; i++){
            if(getRidePrices()[i] < getRidePrices()[num]) {
                num = i;
            }
        }
        return "The cheapest option for you is: " + ticketType[num];
    }

    public static void main(String[] args) {
        TransitCalculator one = new TransitCalculator(29, 76);
        TransitCalculator two = new TransitCalculator(1, 5);
        TransitCalculator three = new TransitCalculator(7, 32);
        one.getBestFare();
        two.getBestFare();
        three.getBestFare();
        System.out.println(one.getBestFare());
        System.out.println(two.getBestFare());
        System.out.println(three.getBestFare());
    }
}