class Person {
  public static int count = 0;
  public String firstName;
  public String middleName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    this(firstName, lastName, age, height, weight);
    this.middleName = middleName;
  }

  public String fullName() {
    // �ȉ����AmiddleName���Ȃ��ꍇ�Ƃ���ꍇ�ŏ���������s���Ă�������
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }


  }

  public void printData() {
    System.out.println("���̖��O��" + this.fullName() + "�ł�");
    System.out.println("�N���" + this.age + "�΂ł�");
    System.out.println("�g����" + this.height + "m�ł�");
    System.out.println("�̏d��" + this.weight + "kg�ł�");
    System.out.println("BMI��" + Math.round(this.bmi()) + "�ł�");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public static void printCount() {
    System.out.println("���v" + Person.count + "�l�ł�");
  }
}
