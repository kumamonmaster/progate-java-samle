class Main {
  public static void main(String[] args) {
    // fullName���\�b�h�̌��ʂ�ϐ�name�ɑ�����Ă�������
    String name = fullName("Kate", "Jones");

    // printData�̈��������������Ă�������
    printData(name, 27);

    // ������͏��������Ȃ��ł�������
    printData("John Christopher Smith", 65);

  }

  public static void printData(String name, int age) {
    System.out.println("���̖��O��" + name + "�ł�");
    System.out.println("�N���" + age + "�΂ł�");
  }

  // fullName���\�b�h���`���Ă�������
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

}
