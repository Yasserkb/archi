package org.proj.Presentation;


import org.proj.Data.Data;
import org.proj.Metier.Imetier;
import org.proj.Metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres {


    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("add a class name :");

        String name = sc.nextLine();


        Scanner scanner =new Scanner(new File(name));
        String dataClassName=scanner.nextLine();
        System.out.println(dataClassName);
        Class cData =Class.forName(dataClassName);//toute les classes sont chargee
        //en memoire sous forme d'un objet de type class
        Data data =(Data)cData.getConstructor().newInstance(); //=> new DataImpl
        System.out.println(data.getData());

        String metierClassName=scanner.nextLine();
        System.out.println(metierClassName);
        Class cMetier =Class.forName(metierClassName);
        Imetier metier = (MetierImpl)cMetier.getConstructor(Data.class).newInstance(data);

        System.out.println("RESPONSE = " + metier.calcul());


    }
}
