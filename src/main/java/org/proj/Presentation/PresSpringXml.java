package org.proj.Presentation;

import org.proj.Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        Imetier metier  = (Imetier) springContext.getBean("metier");
        System.out.println("RES=" + metier.calcul());
    }
}
