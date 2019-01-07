import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();

    }

    static void taskOne() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("\\d{3}.\\d{1,3}.\\d{1,3}.\\d{1,3}");
        Matcher matcher = pattern.matcher(str);
        boolean found = matcher.matches();
        if (found) System.out.println("IP адресс корректный");
        else System.out.println("IP адресс не корректный");
    }

    static void taskTwo() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("[A-Z, А-Я].*[.]");
        Matcher matcher = pattern.matcher(str);
        boolean found = matcher.matches();
        if (found) System.out.println("Предложение оформлено верно");
        else System.out.println("Предложение оформлено не корректно");
    }

    static void taskThree(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("\\w{3,15}[@]\\w+[.]\\w+");
        Matcher matcher = pattern.matcher(str);
        boolean found = matcher.matches();
        if (found) System.out.println("Email is ok");
        else  System.out.println("Email is incorrect");
    }

}
