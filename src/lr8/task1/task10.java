package lr8.task1;

import java.io.*;

public class task10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            // Создание потоков
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("F:\\Java\\task10\\MyFile1.txt"),
                    "cp1251"));
            out = new PrintWriter("F:\\Java\\task10\\MyFile2.txt", "cp1251");
            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            out.flush();
            out.close();
        }
    }
}
