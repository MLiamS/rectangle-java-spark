import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Enter length of your rectangle yo");
    String userLength = console.readLine();
    int intLength = Integer.parseInt(userLength);
    System.out.println("Enter width of your rectangle yo");
    String userWidth = console.readLine();
    int intWidth = Integer.parseInt(userWidth);
    Rectangle userRectangle = new Rectangle(intLength, intWidth);
    boolean squareResult = userRectangle.isSquare();
    System.out.println("True or false: your rectangle is also a square: " + squareResult + "! Cool.");
  }
}
