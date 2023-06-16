import ftc.Motor;
import ftc.Sleep;

public class Main{
    public static void main(String[] args){
        Motor motorOne = new Motor(0);
        Motor motorTwo = new Motor(0);

        setPowerBoth(motorOne, motorTwo, 0.5);
        Sleep.forMilliseconds(3000);
        setPowerBoth(motorOne, motorTwo, 0.5);
    }

    public static void setPowerBoth(Motor one, Motor two, double power){
        one.setPower(power);
        two.setPower(power);
    }
}