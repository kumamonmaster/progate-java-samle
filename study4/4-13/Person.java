class Person {
  // int�^�̃N���X�t�B�[���hcount���`���A0�������Ă�������
  public static int count = 0;

  public String firstName;
  public String lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    // �ϐ�count��1�𑫂��Ă�������
    count++;

    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public void printData() {
    System.out.println("���̖��O��" + this.fullName() + "�ł�");
    System.out.println("�N���" + this.age + "�΂ł�");
    System.out.println("BMI��" + Math.round(this.bmi()) + "�ł�");
  }
}
