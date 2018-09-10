class Person {
  public static void printData(String name, int age, double height, double weight) {
    System.out.println("���O��" + name + "�ł�");
    System.out.println("�N���" + age + "�΂ł�");
    if (age >= 20) {
      System.out.println("���N�҂ł�");
    } else {
      System.out.println("�����N�҂ł�");
    }
    System.out.println("�g����" + height + "m�ł�");
    System.out.println("�̏d��" + weight + "kg�ł�");

    double bmi = bmi(height, weight);
    System.out.println("BMI��" + Math.round(bmi) + "�ł�");
    if (isHealthy(bmi)) {
      System.out.println("���N�ł�");
    } else {
      System.out.println("���N�ł͂���܂���");
    }
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

  public static boolean isHealthy(double bmi) {
    if (bmi >= 18.5 && bmi < 25.0) {
      return true;
    } else {
      return false;
    }
  }
}
