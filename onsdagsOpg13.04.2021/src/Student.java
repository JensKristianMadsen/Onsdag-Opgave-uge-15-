import java.util.Scanner;

public class Student {
    private static int number;
    private static int grade;

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        number = readGrade();


        registerGrade(number);
        System.out.println(getGrade());

        //double part1 = part1();
        //double part2 = part2();
        //math(part1, part2);
    }

    public static int readGrade() {
        System.out.println("Insert point from grade");
        int number = scan.nextInt();

        return number;
    }


    public static void registerGrade(int number) {
    /*//System.out.println("Insert point from grade");
    //int number = scan.nextInt();
    if (number < 0) {
      //System.out.println("Illegal Argument Exception");
      throw new IllegalArgumentException("fejl");
    }else {

   */
        if (number < 0 || number == 6) {

            throw new IllegalArgumentException("fejl");
        } else {
            grade = number;

        }
    }


    public static int getGrade() {
        return grade;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static double part1() {
        System.out.println("Insert point from part 1");
        int number = scan.nextInt();
        if (number < 0) {
            //System.out.println("Illegal Argument Exception");
            throw new IllegalArgumentException("fejl");


        }
        double resultat1 = number * 0.25;
        System.out.println(resultat1);

        return resultat1;

    }


    public static double part2() {
        System.out.println("Insert point from part 2");
        int number2 = scan.nextInt();
        double part2 = number2 * 0.75;
        System.out.println(part2);

        return part2;
    }

    public static void math(double part1, double part2) {

        double mathTotal = part1 + part2;
        System.out.println("Math Total: " + mathTotal);
    }
}


  /*String studName;

  public students(String studName) {
    this.studName = studName;
  }*/


