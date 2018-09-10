// Vehicle�N���X�𒊏ۃN���X�ɕύX���Ă�������
abstract class Vehicle {
  private String name;
  private String color;
  protected int distance = 0;

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
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void printData() {
    System.out.println("���O�F" + this.name);
    System.out.println("�F�F" + this.color);
    System.out.println("���s�����F" + this.distance + "km");
  }

  // ���ۃ��\�b�hrun���`���Ă�������
  abstract public void run(int distance);

}
