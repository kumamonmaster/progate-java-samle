class Person {
  public String name;

  // �R���X�g���N�^��String�^�̈������󂯎��悤�ɂ��Ă�������
  Person(String name) {
    System.out.println("�C���X�^���X����������܂���");
    // �C���X�^���X�t�B�[���hname�ɒl���Z�b�g���Ă�������
    this.name = name;

  }

  public void hello() {
    System.out.println("����ɂ��́A����" + this.name + "�ł�");
  }
}
