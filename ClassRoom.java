public class ClassRoom {
    public static void main(String[] args) {
        Wilder c = new Wilder("Jean-Claude", true);
        Wilder c2 = new Wilder("Henri ", false);
        System.out.println(c.whoIam());
        System.out.println(c2.whoIam());
    }

}
