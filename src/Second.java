
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        //Слова из файла упаковываем в лист
        ArrayList<String> list = new ArrayList();
        try {
            FileReader fis = new FileReader("text.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNext()) {
                String s = sc.next();
                list.add(s);
            }
        } catch (IOException e) {
            System.out.println("Ашипка!");
        }
        //Находим слово у которого первая буква первая по алфовиту и ставим его на первое место
        System.out.println(list);
        String firstWorld = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) < firstWorld.charAt(0)) {
                firstWorld = list.get(i);
                list.remove(i);
                list.add(0, firstWorld);
            }
        }
        //Создаю новый лист и подбираю в него слова с совпадающей буквой. Ахтунг!! Код ниже я сам завтра не пойму, но работает.
        ArrayList<String> finishList = new ArrayList();
        finishList.add(0, firstWorld);
        while (finishList.size() != list.size()) {
            for (int i = 0; i < list.size(); i++) {
                char a = list.get(i).charAt(0);
                String b = String.valueOf(a).toLowerCase();
                if (finishList.get(finishList.size() - 1).endsWith(b)) {
                    finishList.add(list.get(i));
                }
            }

        }
        System.out.println(finishList);
    }
}
