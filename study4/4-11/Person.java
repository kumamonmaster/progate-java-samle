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

  // fullName���\�b�h���`���Ă�������
  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  // bmi���\�b�h���`���Ă�������
  public double bmi() {
    return this.weight / this.height / this.height;
  }

}
