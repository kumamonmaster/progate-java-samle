import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car("�t�F���[��", "��");
    Bicycle bicycle = new Bicycle("�r�A���L", "��");

    System.out.println("�y�Ԃ̏��z");
    car.printData();
    System.out.println("-----------------");
    System.out.print("���鋗������͂��Ă��������F");
    int carDistance = scanner.nextInt();
    // run���\�b�h���Ăяo���āA������carDistance��n���Ă�������
    car.run(carDistance);

    System.out.println("-----------------");
    System.out.print("��������ʂ���͂��Ă��������F");
    int litre = scanner.nextInt();
    car.charge(litre);

    System.out.println("=================");
    System.out.println("�y���]�Ԃ̏��z");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("���鋗������͂��Ă��������F");
    int bicycleDistance = scanner.nextInt();
    // run���\�b�h���Ăяo���āA������bicycleDistance��n���Ă�������
    bicycle.run(bicycleDistance);

  }
}
