/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upravlyaushieinstrukcii;

/**
 *
 * @author Aiharo
 */
public class UpravlyaushieInstrukcii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N=100000;
        int i,j;
        long count=0;
        double x,y,Pi;
        for (i=0;i<N;i++){
            for(j=0;j<=N;j++)
            {
            x=(double)i/N;
            y=(double)j/N;
            if((x-0.5)*(x-0.5)+(y-0.5)*(y-0.5)<=0.25) {
                    count ++;
                }
            }
        }
    Pi=(double)4*count/(N+1)/(N+1);
    System.out.println("Вычисление числа Пи с помощью метода Монте-Карло");
    System.out.println("Вычисления значения по "+(long)(N+1)*(N+1)+" точкам");
    System.out.println(Pi);
    System.out.println("Вычисление числа Пи на основе ряда Фурье");
    int n=5000000,k;
    double pi=0,q=4;
    for (k=0;k<=n;k++)
    {
        pi+=q/(2*k+1);
        q*=(-1);
    }
    System.out.println("Вычисление по "+n+" слагаемым ряда");
    System.out.println(pi);
    System.out.println("Вычисление числа Пи на основе произведения");
    int nn=20,k1;
    double P=2,q1=Math.sqrt(2);
    for (k1=1;k1<=nn;k1++)
    {
        P*=2/q1;
        q1=Math.sqrt(2+q1);
    }
    System.out.println("Вычисление по "+nn+" множителям");
    System.out.println(P);
    System.out.println("Решение уравнения методом последовательных итераций");
    double x0=0;
    double x1,f;
    double eps=1E-10;
    int Nmax=1000;
    int n1=0;
    f=x0;
    do {
    n1++;
    x1=f;
    f=(x1*x1+10)/7;
    } while ((n1<Nmax)&&(Math.abs(x1-f)>eps));
    x1=f;
    System.out.println("Решение уравнения ");
    System.out.println ("x= "+x1);
    System.out.println("количество итераций "+(n1+1));
    
    System.out.println("Полет тела в атмосфере");
    double g=9.8, m=0.1, V=100, alpha=60, H1=100,H2=300, gamma1=0.0001,gamma2=0.0001;
    double dt=1E-6, Xn=0,Yn=0,Vn,Un,Fx,Fy,Tmax,Smax,Hmax=0;
    int height = 0;
    alpha=Math.toRadians(alpha);
    Vn=V*Math.cos(alpha);
    Un=V*Math.sin(alpha);
    for (int n2=1;true;n2++)
    {
        Yn+=Un*dt;
        if (Yn<0){
        Tmax=Math.round((n2-1)*dt*100)/100.0;
        Smax=Math.round(Xn*100)/100.0;
        Hmax=Math.round(Hmax*100)/100.0;
        break;
        }
        Xn+=Vn*dt;
        if (Yn>Hmax) {
            Hmax=Yn;
        }
        height=Yn<H1?1:Yn<H2?2:3;
        
        switch (height){
            case 1:
                Fx=gamma1*Vn*Math.sqrt(Vn*Vn+Un*Un);
                Fy=gamma1*Un*Math.sqrt(Vn*Vn+Un*Un);
                break;
            case 2:
                Fx=gamma2*Vn;
                Fy=gamma2*Un;
                break;
            default :
                Fx=0; Fy=0;
        }
        Vn+=-Fx*dt/m;
        Un+=-g*dt-Fy*dt/m;
    }
    System.out.println("Время полета тела Тмакс= "+Tmax);
    System.out.println("Дальность полета тела Smax= "+ Smax);
    System.out.println("Максимальная высота подьема тела Hmax= "+Hmax);
    }
}
