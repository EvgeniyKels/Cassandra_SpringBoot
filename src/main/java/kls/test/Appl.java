package kls.test;

import kls.test.kls.test.model.dto.Child;
import kls.test.kls.test.model.dto.Emploee;
import kls.test.kls.test.model.dto.PersonKey;
import kls.test.kls.test.model.repo.IChildRepo;
import kls.test.kls.test.model.repo.IEmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.UUID;

@SpringBootApplication
public class Appl {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Appl.class);
        IChildRepo childRepo = run.getBean(IChildRepo.class);
        IEmployeeRepo emplRepo = run.getBean(IEmployeeRepo.class);

long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            childRepo.save(new Child(
                    new PersonKey(
                            UUID.randomUUID().toString(),
                            "name " + i,
                            i + 5,
                            "city " + i),
                    "word " + i));

            emplRepo.save(new Emploee(
                    new PersonKey(
                            UUID.randomUUID().toString(),
                            "name " + i,
                            i + 25,
                            "city " + i),
                    "secName " + i
                    )
            );
        }

System.out.println(System.currentTimeMillis() - start);    }
}