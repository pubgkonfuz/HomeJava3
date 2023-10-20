import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> userA = new ArrayList<>();
        userA.add("Лари1");
        userA.add("Алим2");
        userA.add("Сара3");
        userA.add("Валя4");
        userA.add("Харди5");
        System.out.println(userA);

        ArrayList<String> userB = new ArrayList<>();
        userB.add("Лиля1");
        userB.add("Камила2");
        userB.add("Джони3");
        userB.add("Рекс4");
        userB.add("Шарик5");
        System.out.println(userB);

        ArrayList<String> userC = new ArrayList<>();
        Collections.reverse(userB);
        for (int i = 0; i < userA.size(); i++) {
            userC.add(userA.get(i));
            userC.add(userB.get(i));
        }
        System.out.println(userC);

        for (int i = 0; i < userC.size(); i++) {
            for (int j = 0; j < userC.size(); j++) {
                if (userC.get(i).length() < userC.get(j).length()) {
                    String name = userC.get(i);
                    userC.set(i, userC.get(j));
                    userC.set(j, name);
                }
            }
        }
        System.out.println(userC);
    }
}