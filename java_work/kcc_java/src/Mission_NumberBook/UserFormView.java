package Mission_NumberBook;

import java.time.DateTimeException;
import java.util.Scanner;

/*
 *  ����� �Է��� ���� �� �ִ� ��� �Է¿� ���� ó�� ����� �˷��ִ� Ŭ�����̴�.
 * */
public class UserFormView {

    private Manager manager;


    public UserFormView(Manager manager) {
        this.manager = manager;
    }


    /*
     *  ����� �Է��� �޾� ��ȭ��ȣ�� ����Ѵ�.
     *   ����� �Է°��� ��ȿ�� �˻縦 ������� ���ϸ�, ��ϵ��� �ʴ´�.
     * */

    public boolean createUserFormView(Scanner sc) {
        System.out.println("��ȭ��ȣ�� 010-1234-4567�� ������ �����ֽð�, ��¥�� 24/05/29 ������ ���Ѽ� �Է����ּ���");
        System.out.print("�̸� : ");
        String name = sc.nextLine();
        System.out.print("��ȭ��ȣ : ");
        String phoneNumber = sc.nextLine();
        System.out.print("������� : ");
        String birth = sc.nextLine();
        boolean result = false;
        String failMessage = "> ��ȭ��ȣ ��Ͽ� ���� �߽��ϴ� :";
        try {
            PhoneInfo userInfo = PhoneInfo.createPhoneInfo(name, phoneNumber, birth);
            result = manager.addPhoneInfo(userInfo);
            if (!result) {
                System.out.println(failMessage + "��ȭ��ȣ�ΰ� �� á���ϴ�.");
            } else {
                System.out.println(">��ȭ��ȣ ��Ͽ� �����߽��ϴ�.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(failMessage + "error! ��ȭ��ȣ ������ ���� �ʽ��ϴ�. 010-1234-4567�� �������� �Է����ּ���");
            return result;
        } catch (DateTimeException ex) {
            System.out.println(failMessage + "error! ��¥ ������ ���� �ʰų�, ����� �� ���� ��¥�� �Է��ϼ̽��ϴ�. 24/05/29 ������ ���Ѽ� �Է����ּ���");
            return result;
        }
        return result;
    }


    /*
     *   ��ϵ� ��� ����� ������ ����Ѵ�.
     *   �̶� ��ϵ� ������ ���ٸ�, ���� ������ ����Ѵ�.
     *
     * */

    public void printAllPhoneInfo() {
        boolean result = manager.listPhoneInfo();
        if (!result) {
            System.out.println(">��ϵ� ��ȭ��ȣ�� �����ϴ�.");
        }

    }

    /*
     *  ����ڰ� �Է��� ���� ���� ������ �˻��Ѵ�.
     *
     * */
    public void findPhoneInfo(Scanner sc) {
        String[] findMenu = {"�̸�", "��ȭ��ȣ"};
        System.out.println("> �˻� ������ ������ �ּ���");
        for (int i = 0; i < findMenu.length; i++) {
            System.out.print((i + 1) + "." + findMenu[i] + " ");
        }
        System.out.println();

        try {
            int findOption = Integer.parseInt(sc.nextLine());
            boolean result = manager.setFindPolicy(findOption);
            if (!result) {
                System.out.println("error! ��ϵ� ���ؿ��� �����ϼž��մϴ�.");
            } else {

                System.out.println(">" + findMenu[findOption - 1] + "�� �Է��� �ּ���:");
                String findSource = sc.nextLine();
                PhoneInfo[] findInfo = manager.searchPhoneInfo(findSource);

                System.out.println(">�˻����:");
                for (PhoneInfo ph : findInfo) {
                    if (ph != null) {
                        ph.printPhoneInfo();
                    }
                    System.out.println();
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("> error! ������ �Է��ϼž� �մϴ�.");
        }


    }
}