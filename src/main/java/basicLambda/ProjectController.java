package basicLambda;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ProjectController {
    //1. Metoda wypisująca wszystkie projekty
    public void getAllProjects() {
        InMemoryDB.projects.stream()
                .forEach(project -> System.out.println(project));
    }

    //2. Metoda zwracajaca Nazwę oraz budżet projektu
    public void getProjectNameAndBudget() {
        Locale locale = new Locale("pl", "PL");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        InMemoryDB.projects.stream()
                .forEach(project -> System.out.printf("Nazwa: %-30s || Budget: %20s \n",
                        project.getName(), currencyFormatter.format(project.getBudget())));
    }
//3. Metoda zwracająca listę projektów posortowanych po budżecie max->min
    public List<Project> getAllProjectOrderByBudgetDesc(){
        return InMemoryDB.projects.stream()
                .sorted(Comparator.comparingDouble(Project::getBudget).reversed())
                .collect(Collectors.toList());
    }


}
