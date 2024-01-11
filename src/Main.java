public class Main {
    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        Point point = new Point(0, 0);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        System.out.println("distance()= " + point.distance());

        System.out.println("\n*** *** *** *** ***\n");

        Player player1 = new Player("charm", 100, Weapon.MP7);
        player1.loseHealth(Weapon.AWP.getDamage());
        System.out.println(player1);
    }
}