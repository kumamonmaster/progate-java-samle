class Main {
  public static void main(String[] args) {
    int number = 13;

    // default��p���āA�ǂ�case�ɂ����v���Ȃ��ꍇ�̏������L�q���Ă�������
    switch (number % 5) {
      case 0:
        System.out.println("��g�ł�");
        break;
      case 1:
        System.out.println("���g�ł�");
        break;
      case 4:
        System.out.println("���ł�");
        break;
      default:
        System.out.println("�g�ł�");
    }
  }
}
