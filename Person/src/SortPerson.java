import java.util.List;

public class SortPerson {
    public static void sort(List<Person> personList) {
        for (int j = 0; j < personList.size(); j++) {
            Person min = personList.get(j);
            int min_j = j;
            for (int i = 0; i < personList.size(); i++) {
                if (personList.get(j - 1).compareTo(personList.get(j)) > 0) {
                    if (personList.get(j).compareTo(min) < 0) {
                        min = personList.get(j);
                        min_j = i;
                    }
                }
            }
        }
    }
}
