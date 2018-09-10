class Car extends Vehicle {
  private int fuel = 50;

  public int getFuel() {
    return this.fuel;
  }

  // printData���\�b�h���`���Ă�������
  public void printData() {
    System.out.println("���O�F" + this.getName());
    System.out.println("�F�F" + this.getColor());
    System.out.println("���s�����F" + this.getDistance() + "km");
    System.out.println("�K�\�����ʁF" + this.fuel + "L");
  }

  public void charge(int litre) {
    System.out.println(litre + "L�������܂�");
    if (litre <= 0) {
      System.out.println("�����ł��܂���");
    } else if (litre + this.fuel >= 100) {
      System.out.println("���^���܂ŋ������܂�");
      this.fuel = 100;
    } else {
      this.fuel += litre;
    }
    System.out.println("�K�\�����ʁF" + this.fuel + "L");
  }
}
