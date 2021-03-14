import java.util.List;

public class SortPerson {
    public static void sort(List<Person> personList) {
        for (int j = 0; j < personList.size(); j++) {
            Person min = personList.get(j);
            int min_j = j;
            if (personList.get(j).compareTo(min) < 0) ;
            {
                min = personList.get(j);
                min_j = j;
            }
            if (j != min_j) {
                Person prs = personList.get(j);
                personList.set(j, personList.get(min_j));
                personList.set(min_j, prs);
            }
        }
    }
}


