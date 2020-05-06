package basicLambda;

import java.text.NumberFormat;
import java.util.*;
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
    public List<Project> getAllProjectOrderByBudgetDesc() {
        return InMemoryDB.projects.stream()
                .sorted(Comparator.comparingDouble(Project::getBudget).reversed())
                .collect(Collectors.toList());
    }

    //4. Metoda zwraca listę projektów zawierających kategorię w argumencie
    public List<Project> getAllProjectContainsCategoryOrderByBudgetDesc(Category category) {
        return InMemoryDB.projects.stream()
                .filter(project -> project.getCategories().contains(category))
                .sorted(Comparator.comparingDouble(Project::getBudget).reversed())
                .collect(Collectors.toList());
    }

    //5. Metoda zwracająca listę projektów zawierających kategorię określone w argumencie
    public List<Project> getAllProjectWithCategoriesOrderByBudgetDesc(List<Category> categories) {
        return InMemoryDB.projects.stream()
                .filter(project -> project.getCategories().containsAll(categories))
                .sorted(Comparator.comparingDouble(Project::getBudget).reversed())
                .collect(Collectors.toList());
    }
    //6.Metoda zwaracająca sumę dofinansowania projektów
    public double sumOfFoundsProjects(){
                return InMemoryDB.projects.stream()
                .mapToDouble(Project::getProjectFounds)
                .sum();
    }
    //7. Metoda zwracająca średnie dofinansowanie projektów zawierajacych kategorię podaną w argumencie
    public double avgProjectFoundsContainsCategory(Category category){
        OptionalDouble avgOptional = InMemoryDB.projects.stream()
                .filter(project -> project.getCategories().contains(category))
                .mapToDouble(Project::getProjectFounds)
                .average();
        return avgOptional.isPresent() ?avgOptional.getAsDouble() : 0;
    }

    //8. Metoda wypisująca nazwę projektu, ilość kategorii oraz nazwy kategorii wypisane po przecinkach
    public String getAllProjectsFormatted(){
        return InMemoryDB.projects.stream()                                     //zamiana listy projektow na stream
                .map(project -> String.format("%30s | %2d | %s ",                //mapowanie obiektów z listy do napisów
                        project.getName(),
                        project.getCategories().stream()                        //zamiana listy kategorii na stream
                                .count(),                                       //zliczanie kategorii wartość long
                        project.getCategories().stream()                        //zamiana listy kategorii na stream
                                .map(Enum::name)                                //mapowanie nazwy kategorii
                                .collect(Collectors.joining(","))      //zamiana listy na String z separatorem ","
                )).collect(Collectors.joining("\n"));                  //zamiana stream na String
    }


}
