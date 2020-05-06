package basicLambda;

import org.w3c.dom.ls.LSOutput;

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
        Locale locale = new Locale("pl", "PL");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Całkowite dofinansowanie projektów wynosi: "+ currencyFormatter.format(pc.sumOfFoundsProjects()));



    }
}
