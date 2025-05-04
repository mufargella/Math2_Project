import java.util.ArrayList;

public class CalcPf {
    public static int power ;
    public CalcPf(int power){
        this.power=power;

    }
    public static void calcSin(){
int i =power;
        for ( i =power;i>=2;i-=2){
            System.out.println("I"+i+"=((-sin(x)^"+(i-1)+"*cos(x)/"+i+")+("+(i-1)+"/"+i+")*I"+(i-2));

            }
        if (i==1){
            System.out.println("I1=-cos(x)+C");

        }else if (i==0){
            System.out.println("I0=(x+C)+C");
        }




    }
public static void CalcTan(){
       int i = power;

        for ( i =power;i>=2;i-=2){
            System.out.println("I"+i+"=((tan(x)^"+(i-1)+")/"+(i-1)+")-I"+(i-2));

        }
    if (i==1){
        System.out.println("I1=ln(sec(x))+C");

    }else if (i==0){
        System.out.println("I0=(x+C)+C");

    }

}
public static void CalcSec(){
        int i = power;
        for ( i = power;i>=2;i-=2){
            System.out.println("I"+i+"=((tan(x)*sec(x)^"+(i-2)+")/"+(i-1)+")"+"("+(i-2)+"/"+(i-1)+")I"+(i-2));


        }

    if (i==2){
        System.out.println("I2=tan(x)+C");

    }else if (i==1){
        System.out.println("I1=ln(sec(x)+tan(x)))+C");
    }

}

public  static void CalcSinCosDefinite(){
        int nom=1;
        int dom =1;
        int i =power;
        for ( i =power;i>1;i-=2){
            nom*=(i-1);
            dom*=i;



        }
    double result = (double)nom/dom;
    if (i%2==0){
        System.out.println(result*Math.PI/2);

    }else System.out.println(result);


}
public static void CalcTanDefinite(){
    ArrayList<Double>numbers = new ArrayList<Double>();
    int i =power;
    for ( i =power;i>=2;i-=2){
            System.out.println("I"+i+"=1/"+(i-1)+"-I"+(i-2));
            numbers.add(1.0/(double)(i-1));

        }
        double result =  (1.0/(double)power-1.0);

        for (int g=1;g<numbers.size();g++){
            result-=numbers.get(g);


        }if (i==1) System.out.println("I1= "+(result-Math.log(Math.sqrt(2))));
        else if (i==0){
        System.out.println("="+(result-(Math.PI/4.0)));
    }




}



}
