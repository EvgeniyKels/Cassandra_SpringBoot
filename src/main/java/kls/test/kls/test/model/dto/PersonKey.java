package kls.test.kls.test.model.dto;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.util.Objects;

@PrimaryKeyClass
public class PersonKey {
    @PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String id;
    @PrimaryKeyColumn(name = "name", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private String name;
    @PrimaryKeyColumn(name = "age", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    private int age;
    @PrimaryKeyColumn(name = "city", ordinal = 3, type = PrimaryKeyType.CLUSTERED)
    private String city;

    public PersonKey() {
    }

    public PersonKey(String id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonKey personKey = (PersonKey) o;
        return age == personKey.age &&
                Objects.equals(id, personKey.id) &&
                Objects.equals(name, personKey.name) &&
                Objects.equals(city, personKey.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, city);
    }
}
