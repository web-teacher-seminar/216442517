//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        set t = new set();
        t.add(5);
        t.add(6);
        t.add(7);
        t.add(8);
        t.add(9);
        t.add(10);
        t.add(11);
        t.add(12);
        t.add(13);
        t.add(14);
        t.add(15);
        t.add(16);

        t.delete(6);
        System.out.println(t);
        System.out.println(t.find(88));
    }
}