package previous;

import previous.Matrix22Copy;

public class Rotation extends Matrix22Copy {
    private double angles;

    Rotation (double a){
        super(Math.sin(a), Math.cos(a), -Math.cos(a), Math.sin(a));
        angles = a;
    }


    public double getAngles(){
        return angles;
    }


}
