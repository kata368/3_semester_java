package ru.spbu.arts.java.oop.rational;

public class Rational {
    private int n; //numerator - числитель (gore)
    private int d; // denominator - знаменатель (dole)


    Rational (int n, int d){
        this.n=n;
        this.d=d;
        this.simplify();

    }

    public void simplify(){
        if (d==0){
            System.out.println("Error: dividing with zero"); // почему выводит первым?
        }
        int m;
        int nod =1;
        if (Math.abs(n)>Math.abs(d)){
             m = Math.abs(d);
        }else{
             m = Math.abs(n);
        }
        for (int i=2; i<=Math.sqrt(m); i++){
           while (n%i==0 && d%i==0){
               n=n/i;
               d=d/i;
               nod*=i;
           }
        }

    }

    Rational (int n){
        this.n=n;
    }

    public String toString(){
        String text;
        text=n+"/"+d;
        if (n==0){
          text="0";
        }
        if (d==1){
            text=Integer.toString(n);
        }
        if (d==0){
            text=Integer.toString(n);
        }
        return text;
    }

    public double toDouble(){
        return (double) n/d;
    }

    public void addInPlace(Rational forAdding){ //как вставить объект?
        int dForAdding =d;
        d=forAdding.d*d;
        n =(n*forAdding.d)+(forAdding.n*dForAdding);
        simplify();

    }

    public Rational add(Rational forAdding){
        int dForAdding =d;
        int newD=forAdding.d*d;
        int newN =(n*forAdding.d)+(forAdding.n*dForAdding);
        Rational answer = new Rational(newN,newD);
        answer.simplify();
        return answer;
    }

    public void subInPlace(Rational forSub){
        int dForSub=d;
        d=forSub.d*d;
        n =(n*forSub.d)-(forSub.n*dForSub);
        simplify();
    }

    public Rational sub(Rational forSub){
        int dForSub=d;
        int newD=forSub.d*d;
        int newN =(n*forSub.d)-(forSub.n*dForSub);
        Rational answer = new Rational(newN,newD);
        answer.simplify();
        return answer;
    }

    public void mulInPlace(Rational forMul){
        n=n*forMul.n;
        d=d* forMul.d;
        simplify();
    }

    public Rational mul(Rational forMul){
        int newN=n*forMul.n;
        int newD=d* forMul.d;
        Rational answer = new Rational(newN, newD);
        answer.simplify();
        return answer;
    }

    public void divInPlace(Rational forDiv){
        n=n* forDiv.d;
        d=d* forDiv.n;
        simplify();
    }

    public Rational div(Rational forDiv){
        int newN=n* forDiv.d;
        int newD =d* forDiv.n;
        Rational answer = new Rational(newN, newD);
        answer.simplify();
        return answer;
    }


}
