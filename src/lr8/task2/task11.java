package lr8.task2;

import java.io.*;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd;
        PrintWriter wr;
        Scanner in = new Scanner(System.in);
        try {
            File f1 = new File("F:\\Java\\task11\\Result.txt");
            wr = new PrintWriter(f1.getAbsolutePath(),"cp1251");
            String str;
            for (int i = 0; i < 2; i++) {
                System.out.println("Введите текст: ");
                str = in.nextLine();
                wr.println(str);
            }
            System.out.println("Введите 5 чисел типа double для записи в файл: ");
            for (int i = 0; i < 5; i++) {
                double number = in.nextDouble();
                wr.println(number);
            }
            wr.flush();
            wr.close();

            rd = new BufferedReader(new InputStreamReader(new FileInputStream(f1.getAbsolutePath()), "cp1251"));

            for(int i = 1; i< 3; i++){
                str= rd.readLine();
                if (i == 2) {
                    wr.println(str);
                }
            }
            double db;
            for(int i = 0; i< 5; i++){
                db = Double.parseDouble(rd.readLine());
                if (db > 0) wr.println(db);
            }
        }catch(IOException e){
            System.out.println("Ошибка: " + e);
        }
    }
}