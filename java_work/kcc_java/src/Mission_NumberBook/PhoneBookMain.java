package Mission_NumberBook;

import java.util.Scanner;


public class PhoneBookMain {
    private static UserFormView userFormView;
    private static Scanner sc;

    public static void main(String[] args) {
        //�޴� ���� ����

        String[] menuList = preprocess();


        //�Է� �б� ó��
        boolean result = false;
        System.out.println("�ȳ��ϼ��� ��ȭ��ȣ�� ���α׷��� �����մϴ�.");
        while (true) {
            printMenu(menuList);
            try {
                int userInput = Integer.parseInt(sc.nextLine());

                switch (userInput) {
                    case 1:
                        System.out.println(">�޴� 1");
                        result = userFormView.createUserFormView(sc);
                        break;
                    case 2:
                        System.out.println(">�޴� 2");
                        userFormView.printAllPhoneInfo();
                        break;
                    case 3:
                        System.out.println(">�޴� 3");
                        userFormView.findPhoneInfo(sc);
                        break;
                    case 4:
                        System.out.println(">�޴� 4");
                        System.out.println(">���α׷��� �����մϴ�.");
                        return;
                    default:
                        System.out.println("�޴��� �ִ� ��ɸ� ���� �����մϴ�.");

                }
            } catch (NumberFormatException e) {
                System.out.println("error! ������ �Է����ּ���");
                continue;
            }
        }

    }

    private static void printMenu(String[] menu) {
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.print((i + 1) + "." + menu[i]);
        }
        System.out.println();
    }

    private static String[] preprocess() {
        userFormView = new UserFormView(new Manager());
        sc = new Scanner(System.in);
        return new String[]{"�߰�", "��ü���", "�˻�", "����"};
    }


}