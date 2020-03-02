package kls.test;

import kls.test.kls.test.AdClick;
import kls.test.kls.test.ITest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Appl {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Appl.class);
        ITest beanTest = run.getBean(ITest.class);
        List <AdClick> all = beanTest.getAll();
        all.forEach(System.out::println);

        List <AdClick> d = beanTest.get();
        d.forEach(System.out::println);

    }
}
