class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);

    Car car = new Car("�t�F���[��", "��");
    Bicycle bicycle = new Bicycle("�r�A���L", "��");

    // buy���\�b�h��p���āAperson1��car���w�������Ă�������
    person1.buy(car);

    // buy���\�b�h��p���āAperson2��bicycle���w�������Ă�������
    person2.buy(bicycle);

    System.out.println("�y�Ԃ̏��z");
    car.printData();
    System.out.println("-----------------");
    System.out.println("�y�Ԃ̏��L�҂̏��z");
    car.getOwner().printData();

    System.out.println("=================");
    System.out.println("�y���]�Ԃ̏��z");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.println("�y���]�Ԃ̏��L�҂̏��z");
    bicycle.getOwner().printData();
  }
}
