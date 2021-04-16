import java.util.Scanner;

public class UI {

  public void printMessage(String msg) {
    System.out.println(msg);
  }

  public int getInt(String message) {
    Scanner scan = new Scanner(System.in);
    System.out.print(message);
    return scan.nextInt();
  }

  public void printErrorMessage(String errmsg) {
    System.out.println(errmsg);
  }
}