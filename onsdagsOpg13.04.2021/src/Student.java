import java.util.Scanner;

public class Student {
  private int number;
  private int grade;

  Scanner scan = new Scanner(System.in);


  public int readGrade() {
    System.out.println("Insert point from grade");
    int number = scan.nextInt();

    return number;
  }

  public void registerGrade(int number) {

    if (number < -3 || number == -2 || number == -1 || number == 1 || number == 3 || number == 5
        || number == 6 || number == 8 || number == 9 || number == 11 || number > 12) {

      throw new IllegalArgumentException("fejl");

    } else {

      grade = number;
    }
  }
  public void pintStundesGrade(int grade) {

  }


  public int getGrade() {
    return grade;
  }
/*
  public void setNumber(int number) {
    this.number = number;
  }

  public static double part1() {
    System.out.println("Insert point from part 1");
    int number = scan.nextInt();
    if (number < 0) {
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
  }*/
}


