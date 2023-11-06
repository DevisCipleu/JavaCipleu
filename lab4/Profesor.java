package lab4;

public class Profesor extends Person{

    private String[] courses = new String[5];


    public void setCourses(){
        for(int i = 0 ; i < courses.length ; i++){
            System.out.println("Introduceti curs " + (i+1) + " : ");
            courses[i] = scanner.nextLine();
        }
    }
    public String[] getCourses(){
        return courses;
    }
}
