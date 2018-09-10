class Person {
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
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

  // printData���\�b�h���`���Ă�������
  public void printData() {
    System.out.println("���̖��O��" + this.fullName() + "�ł�");
    System.out.println("�N���" + this.age + "�΂ł�");
    System.out.println("BMI��" + Math.round(this.bmi()) + "�ł�");
  }

}
