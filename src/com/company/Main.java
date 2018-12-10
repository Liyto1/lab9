package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль!");
        String Password=in.nextLine();
        if(Password.equals("Hello123")) {
            ConsoleMenu cs = new ConsoleMenu();
            Controller AB=new Controller();
            Model AL=new Model();
            int ch=0;
            cs.ShowMenu();
            AL.Read();
            do {
                try {
                    ch = in.nextInt();
                }catch (Exception e){
                    System.out.println("Не правильно введены данные!");
                    break;
                }
                switch (ch) {
                    case 1: {
                        System.out.println("Все данные!");
                        AL.Basa2();
                        System.out.println("----------------------");
                        cs.ShowMenu();
                        break;
                    }
                    case 2:{
                        System.out.println("Добавьте данные!");
                        AB.Add1();
                        System.out.println("Данные успешно добавлены!");
                        System.out.println("----------------------");
                        cs.ShowMenu();
                        break;
                    }
                    case 3: {
                        System.out.println("Выберите данные которые вы хотите редактировать! Например строка '2',отсчет строк начинается с нуля!");
                        AB.Replace();
                        System.out.println("----------------------");
                        cs.ShowMenu();
                        break;
                    }
                    case 4: {
                        System.out.println("Выберите данные которые вы хотите удалить! Например строка '3',отсчет строк начинается с нуля!");
                        AB.Delete();
                        System.out.println("----------------------");
                        cs.ShowMenu();
                        break;
                    }
                    default:{
                        if(ch!=5) {
                            System.out.println("Неверные данные, выберите вариант от одного до пяти!");
                            break;
                        }
                    }
                }
            } while (ch != 5);
            AL.File();
        }else{
            System.out.println("Неверный пароль!");
        }
    }}