abstract class Vehicle {
  private String name;
  private String color;
  protected int distance = 0;
  // �C���X�^���X�t�B�[���howner���`���Ă�������
  private Person owner;

  Vehicle(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return this.name;
  }
  public String getColor() {
    return this.color;
  }
  public int getDistance() {
    return this.distance;
  }

  // owner�t�B�[���h�̃Q�b�^�[���`���Ă�������
  public Person getOwner() {
    return this.owner;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }

  // owner�t�B�[���h�̃Z�b�^�[���`���Ă�������
  public void setOwner(Person person) {
    this.owner = person;
  }

  public void printData() {
    System.out.println("���O�F" + this.name);
    System.out.println("�F�F" + this.color);
    System.out.println("���s�����F" + this.distance + "km");
  }

  abstract public void run(int distance);
}