// java.util.Scanner��ǂݍ���ł�������
import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("���O�F ");

    // �ϐ�name���`���A�R���\�[�����當������󂯎���đ�����Ă�������
    String name = scanner.next();

    // �u����ɂ��́�������v�Əo�͂��Ă�������
    System.out.println("����ɂ���" + name + "����");
  }
}
