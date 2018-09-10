class Person {
  public static void printData(String name, int age, double height, double weight) {
    System.out.println("„‚Ì–¼‘O‚Í" + name + "‚Å‚·");
    System.out.println("”N—î‚Í" + age + "Î‚Å‚·");
    System.out.println("g’·‚Í" + height + "m‚Å‚·");
    System.out.println("‘Ìd‚Í" + weight + "kg‚Å‚·");

    double bmi = bmi(height, weight);
    System.out.println("BMI‚Í" + bmi + "‚Å‚·");

    if (isHealthy(bmi)) {
      System.out.println("Œ’N‚Å‚·");
    } else {
      System.out.println("Œ’N‚Å‚Í‚ ‚è‚Ü‚¹‚ñ");
    }
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

  public static boolean isHealthy(double bmi) {
    return bmi >= 18.5 && bmi < 25.0;
  }
}
