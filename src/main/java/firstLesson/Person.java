package firstLesson;

import java.util.Objects;

public class Person {

    public String name;
    public int age;
    public String no;

    public Person(String name, int age, String no) {
        this.name = name;
        this.age = age;
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(no, person.no);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return no;
    }


}