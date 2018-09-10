import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car();
    car.setName("ƒtƒFƒ‰[ƒŠ");
    car.setColor("Ô");
    Bicycle bicycle = new Bicycle();
    bicycle.setName("ƒrƒAƒ“ƒL");
    bicycle.setColor("—Î");

    System.out.println("yÔ‚Ìî•ñz");
    car.printData();
    System.out.println("-----------------");
    System.out.print("‹‹–û‚·‚é—Ê‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢F");
    int litre = scanner.nextInt();
    car.charge(litre);

    System.out.println("=================");
    System.out.println("y©“]Ô‚Ìî•ñz");
    bicycle.printData();
  }
}
