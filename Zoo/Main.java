import com.sun.source.tree.BreakTree;

import javax.security.auth.login.CredentialException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> animalData = new HashMap<>();
        animalData.put("Lion", 1);
        animalData.put("Shark", 2);
        animalData.put("Salmon", 3);
        animalData.put("Nightingale", 4);

        for (Map.Entry<String, Integer> entry : animalData.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
            System.out.println("Введите номер жителя зоопарка:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();


            enum Creatures {
                Lion, Shark, Salmon, Nightingale;
            }


            Creatures name = Creatures.values()[n - 1];
            switch (name) {
                case Lion:
                    Lion lion = new Lion();
                    lion.roar();
                    lion.breathe();
                    lion.move();
                    break;
                case Shark:
                    Shark shark = new Shark();
                    shark.eat();
                    shark.breathe();
                    shark.move();
                    break;
                case Salmon:
                    Salmon salmon = new Salmon();
                    salmon.roe();
                    salmon.breathe();
                    salmon.move();
                    break;
                case Nightingale:
                    Nightingale nightingale = new Nightingale();
                    nightingale.sing();
                    nightingale.breathe();
                    nightingale.move();
                    break;
            }
        }
    }



