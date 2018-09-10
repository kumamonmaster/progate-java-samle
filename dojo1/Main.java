import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("���l���̏�����͂��܂����F");
    int count = scanner.nextInt();

    int maxAge = 0;
    int totalAge = 0;

    for (int i = 1; i <= count; i++) {
      System.out.println(i + "�l��");
      System.out.print("���O�F");
      String firstName = scanner.next();

      System.out.print("�����F");
      String lastName = scanner.next();

      System.out.print("�N��F");
      int age = scanner.nextInt();

      if (age > maxAge) {
        maxAge = age;
      }
      totalAge += age;

      System.out.print("�g��(m)�F");
      double height = scanner.nextDouble();

      System.out.print("�̏d(kg)�F");
      double weight = scanner.nextDouble();

      Person.printData(Person.fullName(firstName, lastName), age, height, weight);
    }

    System.out.println("�ō��N���" + maxAge + "�΂ł�");
    System.out.println("���ϔN���" + totalAge / count + "�΂ł�");
  }
}
