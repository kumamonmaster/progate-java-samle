class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);

    Car car = new Car("�t�F���[��", "��");
    // setOwner��p���āAcar�̏��L�҂�person1�ɂ��Ă�������
    car.setOwner(person1);

    Bicycle bicycle = new Bicycle("�r�A���L", "��");
    // setOwner��p���āAbicycle�̏��L�҂�person2�ɂ��Ă�������
    bicycle.setOwner(person2);

    System.out.println("�y�Ԃ̏��z");
    car.printData();
    System.out.println("-----------------");
    System.out.println("�y�Ԃ̏��L�҂̏��z");
    // getOwner���\�b�h��p����car��owner���擾���A
    // �����printData���\�b�h��p����owner�̏����o�͂��Ă�������
    car.getOwner().printData();

    System.out.println("=================");
    System.out.println("�y���]�Ԃ̏��z");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.println("�y���]�Ԃ̏��L�҂̏��z");
    // getOwner���\�b�h��p����bicycle��owner���擾���A
    // �����printData���\�b�h��p����owner�̏����o�͂��Ă�������
    bicycle.getOwner().printData();

  }
}
