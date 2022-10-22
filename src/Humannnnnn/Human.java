package Humannnnnn;

public class Human {     //Класс Human со своими параметрами (прмер: name, surname, age, gender);

    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String gender;

    public Human(Integer id, String name, String surname, Integer age, String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
