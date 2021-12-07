public class Matrix22 {
    int[][] matrix = new int[2][2];
    int trace;
    int discriminant;


    Matrix22(int a, int b, int c, int d){
        this.matrix[0][0]=a;
        this.matrix[0][1]=b;
        this.matrix[1][0]=c;
        this.matrix[1][1]=d;
    }

    Matrix22(int [][] a){
        this.matrix=a;

    }

    public static void main(String args[]){
        var test =new Matrix22(1,2,3,4);
        MultidimentionalArrays.printTable1(test.getMatrix());
        var test1= new Matrix22(new int[][]{{1, 2}, {3,4}});
        MultidimentionalArrays.printTable1(test1.getMatrix());


        test.toString();

        MultidimentionalArrays.printTable1(test.add(new Matrix22(4,4,7,8)));
        MultidimentionalArrays.printTable1(test.mul(new Matrix22(4,4,7,8)));


    }

    public int[][] getMatrix(){
        return matrix;
    }


    private void traceAndDiscr(){
        this.trace = matrix[0][0]+matrix[0][1];
        this.discriminant = matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];

    }

    public int[][] getCopy(){
        int[][] matrix1=matrix;
        return matrix1;
    }

    public String toString(){
        String lines = "";
        for (int[] line : matrix){
            for (int x: line){
                lines= lines + x +" ";
            }
            System.out.println(lines);
            lines= "";
        }
        return lines;
    }

    public int[][] add(Matrix22 b ){
        int[][] answer = new int[2][2];
        int [][] c=b.getMatrix();
        answer[0][0]=this.matrix[0][0]+c[0][0];
        answer[0][1]=this.matrix[0][1]+c[0][1];
        answer[1][0]=this.matrix[1][0]+c[1][0];
        answer[1][1]=this.matrix[1][1]+c[1][1];
        return answer;

    }


    public int[][] mul(Matrix22 b){
        int[][] answer = new int[2][2];
        int [][] c=b.getMatrix();
        answer[0][0]=matrix[0][0]*c[0][0]+matrix[0][1]*c[1][0];
        answer[0][1]=matrix[0][1]*c[0][1]+matrix[0][1]*c[1][1];
        answer[1][0]=matrix[1][0]*c[1][0]+matrix[1][1]*c[1][0];
        answer[1][1]=matrix[1][1]*c[1][1]+matrix[1][1]*c[1][1];
        return answer;

    }
    public int[][] pow(int n){
        Matrix22 originall = new Matrix22(this.matrix);

        int[][] original= originall.getMatrix();
        for (int i=1; i<=n; i++){
            matrix[0][0]=matrix[0][0]*original[0][0]+matrix[0][1]*original[1][0];
            matrix[0][1]=matrix[0][1]*original[0][1]+matrix[0][1]*original[1][1];
            matrix[1][0]=matrix[1][0]*original[1][0]+matrix[1][1]*original[1][0];
            matrix[1][1]=matrix[1][1]*original[1][1]+matrix[1][1]*original[1][1];

        }
        return matrix;
    }

    public static void printTable1(int[][] a){
        String lines = "";
        for (int[] line : a){
            for (int x: line){
                lines= lines + x +" ";
            }
            System.out.println(lines);
            lines= "";
        }
    }




}

