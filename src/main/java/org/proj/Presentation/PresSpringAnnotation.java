package org.proj.Presentation;

import org.proj.Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {

        ApplicationContext springContext = new AnnotationConfigApplicationContext("org.proj.Data","org.proj.Metier");
        Imetier metier = springContext.getBean((Imetier.class));
        System.out.println("RES="+metier.calcul());
    }

}
