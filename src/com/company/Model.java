package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class Model implements Serializable {
    protected static ArrayList<String> list=new ArrayList<String>();
    protected static ArrayList<String> L= new ArrayList<String>();

    public void Basa2(){
        for(String list : list){
            System.out.println(list);
        }
    }
    public void File(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("List.dat"))) {
            oos.writeObject(list);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public void Read(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("List.dat")))
        {
            L=(ArrayList<String>)ois.readObject();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        list=L;
    }
}