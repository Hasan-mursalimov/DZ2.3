import DuplicateException.DuplicateException;

import java.util.List;

public class SortPerson {
    public static void sort(List<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            Person min = personList.get(i);
            int min_i = i;
            for (int j = i + 1; j < personList.size(); j++) {
                try {
                    if ((personList.get(j).getName().equals(min.getName())) & (personList.get(j).getAge() == min.getAge())) {
                        throw new DuplicateException("В таблице имеется дубликат");
                    }
                    if (personList.get(j).compareTo(min) < 0) {
                        min = personList.get(j);
                        min_i = j;
                    }
                } catch (DuplicateException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (i != min_i) {
                Person tmp = personList.get(i);
                personList.set(i, personList.get(min_i));
                personList.set(min_i, tmp);
            }
        }
    }
}
