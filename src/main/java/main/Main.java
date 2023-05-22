package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String s = context.getBean(String.class);
        System.out.println(s);
        Integer i = context.getBean(Integer.class);
        System.out.println(i);
        Parrot p = context.getBean("parrot3",Parrot.class);
        System.out.println(p.getName());
        Parrot p2 = context.getBean("parrot", Parrot.class);
        System.out.println(p2.getName());
    }
}
