import java.util.Scanner;

public class UI {


    public void printMesseg(String msg){
        System.out.println(msg);


    }
    public int getInt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        return scan.nextInt();
    }
}
