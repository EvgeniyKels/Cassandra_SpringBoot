package kls.test.kls.test.model.dto;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

public abstract class Person {
    @PrimaryKey
    private PersonKey personKey;

    public Person() {
    }

    public Person(PersonKey personKey) {
        this.personKey = personKey;
    }

    public PersonKey getPersonKey() {
        return personKey;
    }

    public void setPersonKey(PersonKey personKey) {
        this.personKey = personKey;
    }
}
