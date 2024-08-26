import java.util.Scanner;

public class IT24100264Lab5Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_3_TO_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;
        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();
        System.out.println();
           
        if ((startDate<1 || startDate >31) || (endDate<1 || endDate>31)){
           System.out.print("Error : Days must be between  1 and 31");
            return;
        }

        
         if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        
        int daysReserved = endDate - startDate;

       
        int discountRate = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

       
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalAmount * discountRate / 100;
        totalAmount -= discountAmount;

       
        System.out.println("Room Charge Per Day: " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}
