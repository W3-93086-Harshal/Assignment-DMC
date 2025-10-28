
public class Main {
    public static void main(String[] args) {

        List lt = new List();

        lt.add(10);
        lt.add(10);
        lt.add(10);
        lt.add(4);
        lt.add(10);
        lt.add(10);
        lt.add(10);

        lt.addAfter(6,4);
        lt.addBefore(6,4);
        lt.display();
    }
}