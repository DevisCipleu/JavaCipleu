package lab6;

public abstract class Shape {
    public Shape(Integer l) {
        this.l = l;
    }

    protected Integer l;
    public abstract Double area();
    public abstract Integer perimeter();

    public void desen(){
        System.out.println("Area of shape: " +area());
        System.out.println("Perimeter of shape: " +perimeter());
    }

    public void desen(String culoare){
        System.out.println("Area of shape: " +area());
        System.out.println("Perimeter of shape: " +perimeter());
        System.out.println("Color of shape: " +culoare);

    }

    public static void afisazaCeva(){
        System.out.println("Ceva");
    }

}
