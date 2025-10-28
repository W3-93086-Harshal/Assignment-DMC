public class Main {


    public static void main(String[] args) {
        List list = new List();
        System.out.println(list.isEmpty());

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);

        list.display();
        list.addFirst(50);
        list.addFirst(60);
        list.addFirst(70);
        list.addFirst(80);

        list.display();
    }
}