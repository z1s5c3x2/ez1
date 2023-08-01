package java1.day14.EX3_parcall;

public class SuperAir extends AirP{
    public static final int NOMAL = 1;
    public static final int SUPERSONIC =2;
    public int flyMode = NOMAL;

    public void fly()
    {
        if(flyMode == SUPERSONIC)
        {
            System.out.println("초음속");
        }else{
            super.fly();
        }
    }
}
