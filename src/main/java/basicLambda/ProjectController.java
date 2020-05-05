package basicLambda;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;

public class ProjectController {
//1. Metoda wypisująca wszystkie projekty
public void getAllProjects(){
    InMemoryDB.projects.stream()
            .forEach(project -> System.out.println(project));
}
//2. Metoda zwracajaca Nazwę oraz budżet projektu 
public void getProjectAcronimAndBudget(){
    Locale locale = new Locale("pl","PL");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    InMemoryDB.projects.stream()
            .forEach(project -> System.out.printf("Nazwa: %-30s || Budget: %20s \n",
                    project.getName(), currencyFormatter.format(project.getBudget())));
}



}
