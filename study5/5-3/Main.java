class Main {
  public static void main(String[] args) {
    Car car = new Car();
    // setName���\�b�h��p���āAcar�̖��O���u�t�F���[���v�ɂ��Ă�������
    car.setName("�t�F���[��");

    // setColor���\�b�h��p���āAcar�̐F���u�ԁv�ɂ��Ă�������
    car.setColor("��");

    Bicycle bicycle = new Bicycle();
    // setName���\�b�h��p���āAbicycle�̖��O���u�r�A���L�v�ɂ��Ă�������
    bicycle.setName("�r�A���L");

    // setColor���\�b�h��p���āAbicycle�̐F���u�΁v�ɂ��Ă�������
    bicycle.setColor("��");

    System.out.println("�y�Ԃ̏��z");
    car.printData();

    System.out.println("=================");
    System.out.println("�y���]�Ԃ̏��z");
    bicycle.printData();
  }
}
