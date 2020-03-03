package kls.test.kls.test.model.dto;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;
//CREATE TABLE empl(
//        id TEXT,
//        name TEXT,
//        age int,
//        city TEXT,
//        second_name TEXT,
//        PRIMARY KEY ((id, name), age, city))
//        WITH CLUSTERING ORDER BY (age ASC, city ASC);

@Table("empl")
public class Emploee extends Person{
    @Column("second_name")
    private String secondName;

    public Emploee(PersonKey personKey, String secondName) {
        super(personKey);
        this.secondName = secondName;
    }

    @Override
    public PersonKey getPersonKey() {
        return super.getPersonKey();
    }

    @Override
    public void setPersonKey(PersonKey personKey) {
        super.setPersonKey(personKey);
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
