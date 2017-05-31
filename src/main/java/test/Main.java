package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by E6430 on 05/30/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Account account1 = (Account) context.getBean("account1");
        System.out.println("\nAccount 1 data:");
        System.out.println("ID:"+ account1.getId());
        System.out.println("Account name:"+ account1.getOwnername());
        System.out.println("Balance:"+account1.getBalance());

        Account account2 = (Account) context.getBean("account2");
        System.out.println("\nAccount 2 data:");
        System.out.println("ID:"+account2.getId());
        System.out.println("Account name:"+account2.getOwnername());
        System.out.println("Balance:"+account2.getBalance());
    }


}
