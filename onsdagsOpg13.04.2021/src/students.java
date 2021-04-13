import java.util.Scanner;

public class students {


    String studName;

    public students(String studName) {
        this.studName= studName;
    }

    public static void main(String[] args) {

        System.out.println(Math());
    }


    public static double Math(){
        Scanner scan = new Scanner(System.in);




        System.out.println("Insert point from part 1");
        int number = scan.nextInt();
         double part1 = number * 0.25;
        System.out.println(part1);

        System.out.println("Insert point from part 2");
        int number2 = scan.nextInt();
        double part2 = number2 * 0.75;
        System.out.println(part2);

        double mathTotal = part1 + part2;



         return mathTotal;
    }

    }


