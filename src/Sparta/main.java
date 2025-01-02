package Sparta;

public static class Person{
    String name;
    int age;
    String email;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person person, String email) {
        this.name = person.name;
        this.age = person.age;
        this.email = email;
    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}

public static void main(String[] args) {

    Person p1 = new Person("전탁", 20);
    Person p1_email = new Person(p1, "dasf@naver.com");

    Person p2 = new Person("김기홍", 20);
    Person p2_email = new Person("김기홍", 20, "asdf@naver.com");
}