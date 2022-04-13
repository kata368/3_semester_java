package previous;

import java.util.Arrays;

public class Matrix22Copy {
    double[][] matrix = new double[2][2];
    double trace;
    double discriminant;


    Matrix22Copy(double a, double b, double c, double d){
        this.matrix[0][0]=a;
        this.matrix[0][1]=b;
        this.matrix[1][0]=c;
        this.matrix[1][1]=d;
    }

    public static void main(String args[]){
        Rotation a = new Rotation(90.9);
        System.out.println(a.getAngles());

    }

    Matrix22Copy(double [][] a){
        this.matrix=a;

    }
}
