import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car("�t�F���[��", "��");
    Bicycle bicycle = new Bicycle("�r�A���L", "��");

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
