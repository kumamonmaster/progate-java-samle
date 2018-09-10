class Car extends Vehicle {
  private int fuel = 50;

  public int getFuel() {
    return this.fuel;
  }

  public void printData() {
    // super��p���āA�ȉ��̏d�����������������Ă�������
    super.printData();
    System.out.println("�K�\�����ʁF" + this.fuel + " L");
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
