class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }

  public static void printData(String name, int age, double height, double weight) {
    System.out.println("���̖��O��" + name + "�ł�");
    System.out.println("�N���" + age + "�΂ł�");
    System.out.println("�g����" + height + "m�ł�");
    System.out.println("�̏d��" + weight + "kg�ł�");

    // �ϐ�bmi�ɁAbmi���\�b�h��p����BMI�������Ă�������
    double bmi = bmi(height, weight);

    // �ϐ�bmi��p���āA�uBMI�́����ł��v�Əo�͂��Ă�������
    System.out.println("BMI��" + bmi + "�ł�");

  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

  // bmi���\�b�h���`���Ă�������
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

}
