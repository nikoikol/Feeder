public class Main

{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(2400);
        System.out.println(f);
        System.out.println(f.simulateManyDays(10, 4));
        System.out.println("////");
        Feeder a = new Feeder(250);
        System.out.println(a);
        System.out.println(a.simulateManyDays(10, 5));
        System.out.println("////");
        Feeder b = new Feeder(0);
        System.out.println(b);
        System.out.println(b.simulateManyDays(5, 10));
        System.out.println("////");
        Feeder c = new Feeder(500);
        System.out.println(c);
        System.out.println(c.simulateOneDay(12));
        System.out.println("////");
        Feeder d = new Feeder(1000);
        System.out.println(d);
        System.out.println(d.simulateOneDay(12));
        System.out.println("////");
        Feeder e = new Feeder(100);
        System.out.println(e);
        System.out.println(e.simulateOneDay(5));
        System.out.println("////");
    }

}
