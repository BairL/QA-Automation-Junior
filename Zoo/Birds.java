import org.w3c.dom.ls.LSOutput;

public class Birds implements BreetheAndMove {
    @Override
    public void breathe() {

        System.out.print(" и дышит легкими");
    }

    @Override
    public void move() {

        System.out.println(" ,а летает по воздуху");
    }
}
