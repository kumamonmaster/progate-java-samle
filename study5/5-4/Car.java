class Car extends Vehicle {
  // �C���X�^���X�t�B�[���hfuel���`���Ă�������
  private int fuel = 50;

  // fuel�t�B�[���h�̃Q�b�^�[���`���Ă�������
  public int getFuel() {
    return this.fuel;
  }

  // �C���X�^���X���\�b�hcharge���`���Ă�������
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
