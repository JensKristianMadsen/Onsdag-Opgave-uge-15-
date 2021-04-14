import java.util.Scanner;

public class students {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    double part1 = part1();
    double part2 = part2();
    math(part1, part2);
  }



  public static double part1() {
    System.out.println("Insert point from part 1");
    int number = scan.nextInt();
    if (number <= -1) {

      System.out.println("felj");

    }
      double part1 = number * 0.25;
      System.out.println(part1);

      return part1;

  }


    public static double part2 () {
      System.out.println("Insert point from part 2");
      int number2 = scan.nextInt();
      double part2 = number2 * 0.75;
      System.out.println(part2);

      return part2;
    }

    public static void math ( double part1, double part2){

      double mathTotal = part1 + part2;
      System.out.println("Math Total: " + mathTotal);
    }
  }


  /*String studName;

  public students(String studName) {
    this.studName = studName;
  }*/


