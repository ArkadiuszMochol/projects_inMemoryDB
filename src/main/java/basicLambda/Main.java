package basicLambda;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProjectController pc = new ProjectController();

        //pc.getAllProjects();
        //pc.getProjectNameAndBudget();
        //pc.getAllProjectOrderByBudgetDesc().forEach(System.out::println);
        pc.getAllProjectContainsCategoryOrderByBudgetDesc(Category.IT).forEach(System.out::println);
    }
}
