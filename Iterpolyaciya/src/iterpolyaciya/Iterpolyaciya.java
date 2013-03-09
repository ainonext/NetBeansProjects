/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterpolyaciya;
class InterpAndAprox {
private int n; //размер массива
private double a,b; //параметры регрессионной модели
double [][] data;
//базовые функции в схеме Лагранжа
private double psi (int k,double x){
   int i;
   double s=1;
   for (i=0;i<k;i++){
   s*=(x-data[0][i])/(data[0][k]-data[0][i]);
   }
   for(i=k+1;i<=n;i++){
   s*=(x-data[0][i])/(data[0][k]-data[0][i]);
   }
    return s;
}
//Вычислние параметров регрессионной модели
private void setab(){
double Sxy=0,Sx=0,Sy=0,Sxx=0;
for(int i=0;i<=n;i++){
Sx+=data[0][i];
Sy+=data[1][i];
Sxx+=data[0][i]*data[0][i];
Sxy+=data[0][i]*data[1][i];}
a=((n+1)*Sxy-Sx*Sy)/((n+1)*Sxx-Sx*Sx);
b=Sy/(n+1)-a/(n+1)*Sx;
}
//Регрессионная функция
double approx(double x){
return a*x+b;}
//Интерполяционная функция
double interp(double x){
double s=0;
for (int i=0;i<=n;i++) {
        s+=data[1][i]*psi(i,x);
    }
return s;}
//конструктор класса
InterpAndAprox(int n){
this.n=n;
data=new double[2][n+1];
for(int i=0;i<=n;i++)
{
    data[0][i]=Math.PI*i/n/2;
    data[1][i]=Math.sin(data[0][i]);}
setab();}}

/**
 *
 * @author Aiharo
 */
public class Iterpolyaciya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double x;
    int i, n=4,N=2*n;
    InterpAndAprox obj=new InterpAndAprox(n);
    System.out.printf("%60s","Таблица значений::\n");
    System.out.printf("%25s","Аргумент х ");
    System.out.printf("%25s","Функция у=sin(x)");
    System.out.printf("%25s","Интерп.полином L(x)");
    System.out.printf("%25s","Регр.функция f(x)\n");
    for(i=0;i<=N;i++){
    x=i*Math.PI/N/2;
    System.out.printf("%25s",x);
    System.out.printf("%25s",Math.sin(x));
    System.out.printf("%25s",obj.interp(x));
    System.out.printf("%25s",obj.approx(x)+"\n");}}
}
