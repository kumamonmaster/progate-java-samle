class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27);

    // fullName���\�b�h��p���āAprintData�̈��������������Ă�������
    printData(fullName("John", "Christopher", "Smith"), 65);
  }

  public static void printData(String name, int age) {
    System.out.println("���̖��O��" + name + "�ł�");
    System.out.println("�N���" + age + "�΂ł�");
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  // fullName���\�b�h���`���Ă�������
  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

}
