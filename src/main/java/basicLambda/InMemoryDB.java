package basicLambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface InMemoryDB {
    void dbConnection();
    static List<Project> projects = new ArrayList<>(
    Arrays.asList(
    new Project("SmartCity", 1_500_000, 55, 75,
            new ArrayList<>(Arrays.asList(Category.IT, Category.EDUCATION, Category.ELECTRONICS, Category.TLECOMUNICATION))),
    new Project("JAVA", 1_000_000, 35, 80,
            new ArrayList<>(Arrays.asList(Category.EDUCATION, Category.IT, Category.HR))),
     new Project("CleanAir", 4_000_000, 25, 95,
             new ArrayList<>(Arrays.asList(Category.EDUCATION, Category.ENGINEERING))),
      new Project("Friendly Collection", 500_000, 10, 45,
              new ArrayList<>(Arrays.asList(Category.COLLECTION, Category.FINANCE, Category.IT))))

    );

}
