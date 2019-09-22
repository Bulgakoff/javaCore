package GBmainEgit.javaCore.git.marathon;

import GBmainEgit.javaCore.git.marathon.Actions.Competitor;
import GBmainEgit.javaCore.git.marathon.Actions.Obstacle;
import GBmainEgit.javaCore.git.marathon.Animals.Cat;
import GBmainEgit.javaCore.git.marathon.Animals.Dog;
import GBmainEgit.javaCore.git.marathon.Animals.Team;
import GBmainEgit.javaCore.git.marathon.Human.Human;
import GBmainEgit.javaCore.git.marathon.Obstical.Course;
import GBmainEgit.javaCore.git.marathon.Obstical.Cross;
import GBmainEgit.javaCore.git.marathon.Obstical.Wall;
import GBmainEgit.javaCore.git.marathon.Obstical.Water;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] course = {new Cross(80), new Wall(2), new Water(5), new Cross(120)};
        for (Competitor c : competitors) {// Competitor другой класс но берем как животные,
            // т.к. есть имплементация в них, а точнее в их родителе Animal
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
//        Course c = new Course(...); // Создаем полосу препятствий
//        Team team = new Team(...); // Создаем команду
//        c.doIt(team); // Просим команду пройти полосу
        //team.showResults(); // Показываем результаты

    }
}
