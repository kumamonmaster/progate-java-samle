class Main {
  public static void main(String[] args) {
    System.out.println("=== while�� ===");
    int i = 1;
    while (i < 10) {
      // i��5�̔{���̂Ƃ��A�J��Ԃ��������I�����Ă�������
      if (i % 5 == 0) {
        break;
      }

      System.out.println(i);
      i++;
    }

    System.out.println("=== for�� ===");
    for (int j = 1; j < 10; j++) {
      // j��3�̔{���̂Ƃ��A�������X�L�b�v���Ă�������
      if (j % 3 == 0) {
        continue;
      }

      System.out.println(j);
    }
  }
}
