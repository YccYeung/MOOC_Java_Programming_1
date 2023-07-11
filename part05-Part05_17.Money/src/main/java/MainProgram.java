
public class MainProgram {

    public static void main(String[] args) {
       
        Money first = new Money(1, 0);
        Money second = new Money(1, 50);
        Money third = new Money(-3, 5);
        Money fourth = new Money(2, 0);

        System.out.println(fourth.lessThan(second));

    }
}
