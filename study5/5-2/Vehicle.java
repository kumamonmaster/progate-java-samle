// Vehicle�N���X���`���A
// Car�N���X��Bicycle�N���X�̋��ʕ������ړ����Ă�������
class Vehicle {
  private String name;
  private String color;
  private int distance = 0;

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
}
