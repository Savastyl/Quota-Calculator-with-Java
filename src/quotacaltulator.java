import java.util.Scanner;

public class quotacaltulator {
    public static void main(String args[]){

        //Initialize known values
        int salary = 3500;
        int bonus = 550;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }
        if (sales >= quota) {
            int salesOver = sales - quota;
            System.out.println("Congratulations! This week your sales  " + salesOver + " over of " + quota+"from the quota");
        } else {
            int salesShort = quota - sales;
            System.out.println(" Sorry You did'nt make it this time. You were "+ salesShort + " sales short. "  );
        }

    }
}


