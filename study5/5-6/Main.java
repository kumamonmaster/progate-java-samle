import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car();
    car.setName("�t�F���[��");
    car.setColor("��");
    Bicycle bicycle = new Bicycle();
    bicycle.setName("�r�A���L");
    bicycle.setColor("��");

    System.out.println("�y�Ԃ̏��z");
    car.printData();
    System.out.println("-----------------");
    System.out.print("��������ʂ���͂��Ă��������F");
    int litre = scanner.nextInt();
    car.charge(litre);

    System.out.println("=================");
    System.out.println("�y���]�Ԃ̏��z");
    bicycle.printData();
  }
}
