class Main {
  public static void main(String[] args) {
    int number = 12;

    // switch����p���āAnumber��3�Ŋ������]��ŏ�����������Ă�������
    switch (number % 3) {
      case 0:
        System.out.println("3�Ŋ���؂�܂�");
        break;
      case 1:
        System.out.println("3�Ŋ����1�]��܂�");
        break;
      case 2:
        System.out.println("3�Ŋ����2�]��܂�");
        break;
    }

  }
}
