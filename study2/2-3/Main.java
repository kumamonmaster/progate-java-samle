class Main {
  public static void main(String[] args) {
    // true�Əo�͂����悤�ɂ��Ă�������
    System.out.println(true || false);

    // false�Əo�͂����悤�ɂ��Ă�������
    System.out.println(false && true);

    // �u8 < 5�v���u3 >= 2�v�̌��ʂ��o�͂��Ă�������
    System.out.println(8 < 5 && 3 >= 2);

    // �u8 < 5�v�܂��́u3 >= 2�v�̌��ʂ��o�͂��Ă�������
    System.out.println(8 < 5 || 3 >= 2);

    // �u8 < 5�v�łȂ��A�̌��ʂ��o�͂��Ă�������
    System.out.println(!(8 < 5));

  }
}
