import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("���O�F");
    // ������̓��͂��󂯎���Ă�������
    String firstName = scanner.next();

    System.out.print("�����F");
    // ������̓��͂��󂯎���Ă�������
    String lastName = scanner.next();

    System.out.print("�N��F");
    // �����̓��͂��󂯎���Ă�������
    int age = scanner.nextInt();

    System.out.print("�g��(m)�F");
    // �����̓��͂��󂯎���Ă�������
    double height = scanner.nextDouble();

    System.out.print("�̏d(kg)�F");
    // �����̓��͂��󂯎���Ă�������
    double weight = scanner.nextDouble();

    Person.printData(Person.fullName(firstName, lastName), age, height, weight);
  }
}
