class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.hello();

    // person1�̃C���X�^���X�t�B�[���hname�ɁuKate Jones�v���Z�b�g���Ă�������
    person1.name = "Kate Jones";

    // person1�̃C���X�^���X�t�B�[���hname�̒l���o�͂��Ă�������
    System.out.println(person1.name);

    Person person2 = new Person();
    person2.hello();

    // person2�̃C���X�^���X�t�B�[���hname�ɁuJohn Christopher Smith�v���Z�b�g���Ă�������
    person2.name = "John Christopher Smith";

    // person2�̃C���X�^���X�t�B�[���hname�̒l���o�͂��Ă�������
    System.out.println(person2.name);

  }
}
