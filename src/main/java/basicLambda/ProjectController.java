package basicLambda;

import java.sql.SQLOutput;

public class ProjectController {
//1. Metoda wypisująca wszystkie projekty
public void getAllProjects(){
    InMemoryDB.projects.stream()
            .forEach(project -> System.out.println(project));
}

}
