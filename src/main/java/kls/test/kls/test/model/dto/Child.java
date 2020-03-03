package kls.test.kls.test.model.dto;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Objects;

//CREATE TABLE children(
//        id TEXT,
//        name TEXT,
//        age int,
//        city TEXT,
//        first_word TEXT,
//        PRIMARY KEY ((id, name), age, city))
//        WITH CLUSTERING ORDER BY (age ASC, city ASC);

@Table("children")
public class Child extends Person {
    @Column("first_word")
    private String firstWord;

    public Child(PersonKey personKey, String firstWord) {
        super(personKey);
        this.firstWord = firstWord;
    }

    @Override
    public PersonKey getPersonKey() {
        return super.getPersonKey();
    }

    @Override
    public void setPersonKey(PersonKey personKey) {
        super.setPersonKey(personKey);
    }

    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return Objects.equals(firstWord, child.firstWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstWord);
    }
}
