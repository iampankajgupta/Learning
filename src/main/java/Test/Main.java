package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1,24,12);
        account.deposit(5.0);
        account.withDraw(10);
        System.out.println(account.getBalance());
        System.out.println(account.getDateCreated());

    }
}
