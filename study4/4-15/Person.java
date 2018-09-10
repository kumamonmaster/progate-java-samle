class Person {
  public static int count = 0;
  public String firstName;
  // �C���X�^���X�t�B�[���hmiddleName���`���Ă�������
  public String middleName;

  public String lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  // middleName���󂯎��R���X�g���N�^���`���Ă�������
  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public void printData() {
    System.out.println("���̖��O��" + this.fullName() + "�ł�");
    System.out.println("�N���" + this.age + "�΂ł�");
    System.out.println("BMI��" + Math.round(this.bmi()) + "�ł�");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public static void printCount() {
    System.out.println("���v" + Person.count + "�l�ł�");
  }
}
