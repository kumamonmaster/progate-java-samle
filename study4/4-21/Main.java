class Main {
  public static void main(String[] args) {
    // �d�����u��ҁv�ɂ��Ă�������
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0, "���");
    person1.printData();
    // �d�����u���t�v�ɂ��Ă�������
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0, "���t");
    person2.printData();
    System.out.println("----------------------");
    // person1�̎d�����u�b��v�ɕύX���Ă�������
    person1.setJob("�b��");

    // �uperson1�̎d���������ɕύX���܂����v�Əo�͂����悤�ɂ��Ă�������
    System.out.println("person1�̎d����" + person1.getJob() + "�ɕύX���܂���");

    person1.printData();
  }
}
