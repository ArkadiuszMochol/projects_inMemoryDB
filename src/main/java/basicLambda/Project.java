package basicLambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@Data

public class Project {
    private String name;
    private double budget;
    private int noEmployees;
    private double percentOfFounds;
    private List<Category> categories;

    public double getProjectFouns(){
        return (budget*percentOfFounds)/100;
    }

}
