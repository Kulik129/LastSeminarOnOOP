package Humannnnnn;

public class Relative { //Родственник. Класс Relative содержащий в себе двух людей и связь между ними (Human, Human, Relation
    private Human h1;
    private  Human h2;
    private Relation relation;

    public Relative(final Human h1, final Human h2, final  Relation relation) {
        this.h1 = h1;
        this.h2 = h2;
        this.relation = relation;
    }

    public Human getH1() {
        return h1;
    }

    public Human getH2() {
        return h2;
    }

    public Relation getRelation() {
        return relation;
    }


    @Override
    public String toString() {
        return "Родственник{" +
                "фамилия: " + h1.getSurname()+" " + "имя " + h1.getName()+
                ", фамилия: " + h2.getSurname()+" " + "имя " + h2.getName()+
                ", связь: " + relation +
                '}';
    }
}
