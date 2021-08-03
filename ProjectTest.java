public class ProjectTest{
    public static void main(String[] args){
        // Each one of these will use the ProjectClass that fits the given arguments
        Project MEdia = new Project("MEdia", "Books and stuff");
        Project amazon = new Project("Amazon", "Buy all the things", 5000);
        Project project1 = new Project();
        Project twitter = new Project("Twitter");

        System.out.println(MEdia.getName());
        System.out.println(project1.getName());
        System.out.println(twitter.getName());
        System.out.println(MEdia.elevatorPitch());
        project1.setName("Netflix");
        project1.setDescription("Watch videos");
        System.out.println(project1.elevatorPitch());
        System.out.println(amazon.elevatorPitch());

    }
}