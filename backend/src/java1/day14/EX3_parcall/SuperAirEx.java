package java1.day14.EX3_parcall;

public class SuperAirEx {
    public static void main(String[] args)
    {
        SuperAir sa = new SuperAir();

        sa.takeOff();
        sa.fly();
        sa.flyMode = SuperAir.SUPERSONIC;
        sa.fly();
        sa.flyMode = SuperAir.NOMAL;
        sa.fly();
        sa.land();
    }
}
