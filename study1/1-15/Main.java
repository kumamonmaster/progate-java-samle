class Main {
  public static void main(String[] args) {
    // �ϐ�name�ɁA�D���Ȗ��O�������Ă�������
    String name = "kumamonmaster";

    // �ϐ�age�ɁA�D���ȔN��������Ă�������
    int age = 26;

    // �ϐ�height�ɁA�D���Ȑg���������Ă��������i��: 1.2�j
    double height = 1.6;

    // �ϐ�weight�ɁA�D���ȑ̏d�������Ă��������i��: 20.0�j
    double weight = 58.0;

    // �ϐ�bmi�ɁABMI���v�Z���đ�����Ă�������
    double bmi = weight / (height * 2);

    // ���O�A�N��A�g���A�̏d�ABMI�Ɋւ�������o�͂��Ă�������
    System.out.println("���O��" + name + "�ł�");
    System.out.println("�N���" + age + "�΂ł�");
    System.out.println("�g����" + height + "m�ł�");
    System.out.println("�̏d��" + weight + "kg�ł�");
    System.out.println("BMI��" + bmi + "�ł�");
  }
}
