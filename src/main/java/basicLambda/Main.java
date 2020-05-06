package basicLambda;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ProjectController pc = new ProjectController();

        //pc.getAllProjects();
        //pc.getProjectNameAndBudget();
        //pc.getAllProjectOrderByBudgetDesc().forEach(System.out::println);
        //pc.getAllProjectContainsCategoryOrderByBudgetDesc(Category.IT).forEach(System.out::println);
        //pc.getAllProjectWithCategoriesOrderByBudgetDesc(Arrays.asList(Category.IT, Category.HR))
        //       .forEach(System.out::println);

//        Locale locale = new Locale("pl", "PL");
//        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
//        System.out.println("Całkowite dofinansowanie projektów wynosi: "+ currencyFormatter.format(pc.sumOfFoundsProjects()));

//        Category category = Category.IT;
//        System.out.printf("Średnie dofinansowanie %s: %20.2f PLN",
//                category,
//                pc.avgProjectFoundsContainsCategory(category)
//                );

        System.out.println(pc.getAllProjectsFormatted());

    }
}
