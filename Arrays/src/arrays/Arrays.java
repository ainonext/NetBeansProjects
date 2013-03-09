/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Числа Фибоначи через массив");
        int k, n=20;
        int[] Fib=new int[n];
        Fib[0]=1;
        Fib[1]=1;
        System.out.print(Fib[0]+" "+Fib[1]);
        for(k=2;k<n;k++){
        Fib[k]=Fib[k-1]+Fib[k-2];
        System.out.print(" "+Fib[k]);
        }
        System.out.println("\n");
        // сравнение массивов
        int[] nums= new int []{1,2,3,4,5};
        int[] data=new int[]{1,2,3,4,5};
        //data=nums;
        if(data==nums){
        System.out.println("Совпадающие массивы");
        return;
        }
        if(data.length!=nums.length){
        System.out.println("Разные массивы!");
        return;
        }
        for(int i=0;i<data.length;i++){
        if(data[i]!=nums[i]){
        System.out.println("Несовпадающие элементы!");
        return;}}
        System.out.println("Одинаковые массивы! \n");
        
        System.out.println();
        System.out.println("Транспонирование матрицы");
        int nn=4;
        int [][] A=new int[nn][nn];
        int i,j,tmp;
        System.out.println("До транспонирования");
        for(i=0;i<nn;i++){
        for(j=0;j<nn;j++){
        A[i][j]=(int)(10*Math.random());
        System.out.print(A[i][j]+(j!=nn-1?" ":"\n"));
        }
        }
        for(i=0;i<nn;i++){
        for(j=i+1;j<nn;j++){
        tmp=A[i][j];
        A[i][j]=A[j][i];
        A[j][i]=tmp;
        }
        }
        System.out.println("Матрица после транспонирования");
        for(i=0;i<nn;i++){
        for(j=0;j<nn;j++){
        System.out.print(A[i][j]+(j!=nn-1?" ":"\n"));
        }
        }
        int num=4;
        int [][] AA,BB,C;
        AA=new int [num][num];
        BB=new int[num][num];
        C=new int[num][num];
        System.out.println("Матрица А");
        for(i=0;i<num;i++){
        for(j=0;j<num;j++)
        {
        AA[i][j]=(int)(20*Math.random()-9);
        System.out.print(AA[i][j]+(j!=num-1?" ":"\n"));
        }
        }
        System.out.println("Матрица B");
        for(i=0;i<num;i++){
        for(j=0;j<num;j++)
        {
        BB[i][j]=(int)(20*Math.random()-9);
        System.out.print(BB[i][j]+(j!=num-1?" ":"\n"));
        }
        }
        System.out.println("Матрица С=АВ");
        for(i=0;i<num;i++){
        for(j=0;j<num;j++){
        for(k=0;k<num;k++){
        C[i][j]+=AA[i][k]*BB[k][j];}
        System.out.print(C[i][j]+(j!=num-1?"\t":"\n"));
        }
        }
        }
    }

