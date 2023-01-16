package lr8.task3;

import java.io.*;

public class task12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out=null;
        try {
            String letters = "бБвВгГдДжЖзЗйЙкКлЛмМнНпПрРсСтТфФхХцЦчЧшШщЩ";
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("F:\\Java\\task12\\Text.txt")));
            File f1 = new File("F:\\Java\\task12\\Result.txt");
            f1.createNewFile(); //создание файла
            out = new PrintWriter("F:\\Java\\task12\\Result.txt");
            String stroka;
            int counterLine = 0;
            int counter = 0;
            while ((stroka = br.readLine()) != null) {
                counter = 0;
                out.print("Строка " + counterLine + ": ");
                System.out.print("Строка " + counterLine + ": ");
                if (stroka.length() != 0) {
                    for (String word : stroka.split(" ")) {
                        if (letters.contains(word.substring(0, 1))){
                            out.print(word + " ");
                            System.out.print(word + " ");
                            counter++;
                        }

                    }
                }
                out.print(" Количество слов - " + counter);
                System.out.print(" Количество слов - " + counter + "\n");
                counterLine++;
                out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!"); }
        finally{
            br.close();
            out.flush();
            out.close();
        }
    }
}
