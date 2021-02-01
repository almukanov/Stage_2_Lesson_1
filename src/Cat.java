public class Cat implements CapableOfRunning, Jumpable{
    private int remainedDistanceForToday=5000;
    private int maxJumpHeight=5;



    @Override
    public String toString()
    {
        return "Cat";
    }

    @Override
    public boolean jump(int height)
    {
        boolean canJump = height<=maxJumpHeight;
        System.out.println(canJump?"Cat is jumpping":"Can not jumping");
        return canJump;
    }

    @Override
    public boolean run(int distance)
    {
        boolean canRun = distance<=remainedDistanceForToday;
        remainedDistanceForToday -= distance;
        System.out.println(canRun?"Cat is running":"Can not running");
        return canRun;
    }
}
