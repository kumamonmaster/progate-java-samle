class Main {
  public static void main(String[] args) {
    // �ϐ�numbers�ɁA�^����ꂽ�����̔z��������Ă�������
    int[] numbers = {1, 4, 6, 9, 13, 16};

    int oddSum = 0;
    int evenSum = 0;

    // for����p���āA�z��numbers�̋����̘a�Ɗ�̘a�����߂Ă�������
    for (int number:numbers ) {
      if (number % 2 == 0) {
        evenSum += number;
      } else {
        oddSum += number;
      }
    }

    System.out.println("��̘a��" + oddSum + "�ł�");
    System.out.println("�����̘a��" + evenSum + "�ł�");
  }
}
