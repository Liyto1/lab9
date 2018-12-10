package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller extends Model {
    ConsoleMenu cs = new ConsoleMenu();
    Model AL = new Model();

    public void Add1() {
        Scanner in = new Scanner(System.in);
        list.add(in.nextLine());
    }

    public void Delete() {
        int z;
        Scanner in = new Scanner(System.in);
        z = in.nextInt();
        try {
            list.remove(z);
            System.out.println("Данные успешно удалены!");
        }catch (Exception e){
            System.out.println("Строка не найдена!");
        }
    }
    public void Replace() {
        int z;
        String rep;
        Scanner in = new Scanner(System.in);
        z = in.nextInt();
        try {
            Scanner on = new Scanner(System.in);
            System.out.println("Измените строку!");
            rep = on.nextLine();
            list.set(z, rep);
            System.out.println("Данные успешно заменены!");
        }catch (Exception e){
            System.out.println("Строка не найдена!");
        }
    }
}