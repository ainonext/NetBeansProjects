/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

/**
 *
 * @author Aiharo
 */
class Bernoulli{
private int n;
private double p;
private boolean[] test;
public void setAll(int n, double p){
if(n>=0) {
        this.n=n;
    }
else {
        n=0;
    }
if(p>=0&&p<=1) {
        this.p=p;
    }
else {
        this.p=0;
    }
test=new boolean[n];
for(int i=0;i<n;i++){
if(Math.random()<=p) {
        test[i]=true;
    }
else {
        test[i]=false;
    }}
}
private int getValue(){
int count,i;
for(i=0,count=0;i<n;i++) {
        if(test[i]) {
        count++;
    }
    }
return count;
}
public void show(){
System.out.println("Статистика для схемы Бернулли");
System.out.println("Испытаний"+n);
System.out.println("Вероятность успеха"+p);
System.out.println("Успехов: "+getValue());
System.out.println("Неудач "+(n-getValue()));
System.out.println("Математическое ожидание"+n*p);
System.out.println("Стандартное отклонение "+Math.sqrt(n*p*(1-p)));
}
}
public class MyClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bernoulli obj=new Bernoulli();
        obj.setAll(10000,0.36);
        obj.show();
    }
}
