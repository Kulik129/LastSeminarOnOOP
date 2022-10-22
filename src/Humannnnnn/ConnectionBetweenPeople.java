package Humannnnnn;//Класс содержащий в себе двух людей и связь между ними (Human, Human, Relation

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConnectionBetweenPeople {
    public void connectionPeople() {

        List<Relative> relatives = new ArrayList<>();
        relatives.add(new Relative(new Human(1,"Tomas", "Shelbi", 30, "M"),
                new Human(3,"Finn", "Shelbi", 25, "M"), Relation.BROTHER));

        relatives.add(new Relative(new Human(3,"Finn", "Shelbi", 25, "M"),
                new Human(4,"Jon", "Shelbi", 27, "M"), Relation.BROTHER));

        relatives.add(new Relative(new Human(1,"Tomas", "Shelbi", 30, "M"),
                new Human(4,"Jon", "Shelbi", 27, "M"), Relation.BROTHER));


        relatives.add(new Relative(new Human(1,"Tomas", "Shelbi", 30, "M"),
                new Human(2,"Artur", "Shelbi", 55, "M"), Relation.FATHER));

        relatives.add(new Relative(new Human(2,"Artur", "Shelbi", 55, "M"),
                new Human(1,"Tomas", "Shelbi", 30, "M"), Relation.SAN));

        relatives.add(new Relative(new Human(2,"Artur", "Shelbi", 55, "M"),
                new Human(5,"Polli", "Grey", 51, "W"), Relation.WIFE));

        relatives.add(new Relative(new Human(1,"Tomas", "Shelbi", 30, "M"),
                new Human(5,"Polli", "Grey", 51, "W"), Relation.MOTHER));


        Human tomas = new Human(1,"Tomas", "Shelbi", 30, "M"); // Ищем родственников Томаса Шелби
        Human artur = new Human(2,"Artur", "Shelbi", 55, "M"); // Ищем родственников Артура Шелби

        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Введите 1 если хотите найти братьев Томаса\n" +
                "Введите 2 если хотите найти отца Томаса\n" +
                "Введите 3 если хотите найти сына Артура\n"
        );
        String a = iScanner.next();

        for(Relative r: relatives) {
            switch (a){
                case "1":
                    if(r.getH1().getId() ==  tomas.getId() && r.getRelation() == Relation.BROTHER) {
                        System.out.println(r);
                    }
                    break;
                case "2":
                    if (r.getH1().getId() == tomas.getId() && r.getRelation() == Relation.FATHER) {
                        System.out.println(r);
                    }
                    break;
                case "3":
                    if (r.getH1().getId() == artur.getId() && r.getRelation() == Relation.SAN) {
                        System.out.println(r);
                    }
                    break;
            }
        }
    }
}
