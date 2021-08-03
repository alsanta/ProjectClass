public class Project{
    // member variables
    // You can't modify private variables directly you need to use a method for it
    private String name;
    private String description;
    private double initialCost;

    // This is an example of Overloading, where the same name is used but with
    // different paramaters needed. 
    // constructor (similar to the __init__() from python)
    // This one makes an empty project with no name or description
    public Project(){
        this.name = "No name";
        this.description = "No description";
        this.initialCost = 0;
    }
    // constructor (similar to the __init__() from python)
    // This one makes a project with only a name
    public Project(String name){
        this.name = name;
        this.description = "No description";
        this.initialCost = 0;

    }
    // constructor (similar to the __init__() from python)
    // Project with a name and discription
    public Project(String name, String description){
        this.name = name;
        this.description = description;
        this.initialCost = 0;
    }

    // constructor (similar to the __init__() from python)
    // This makes a complete project
    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }


    // Methods a Project can call on
    // If an object is needed to perform the method DO NOT USE STATIC
    // We make a way to set a name to the project
    public void setName(String name){
        this.name = name;
    }
    // We make a way to set a description to the project
    public void setDescription(String description){
        this.description = description;
    }
    // Way to set a initial cost
    public void setinitialCost(double initialCost){
        this.initialCost = initialCost;
    }
    // To show both the name and description
    public String elevatorPitch(){
        return String.format("%s (%s) : %s", this.name, this.initialCost, this.description );
    }
    // Gets the name, since we made it a private Member Variable this is how
    // They get the name
    public String getName(){
        return this.name;
    }
    // Get the initial cost from the private Member Variable
    public double getInitialCost(){
        return this.initialCost;
    }
    // Gets the description, since we made it a private Member Variable this is how
    // They get the description
    public String getDescription(){
        return this.description;
    }
}