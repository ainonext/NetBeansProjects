
package lake;

import java.util.Scanner;

public class Lake {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        int y=in.nextInt();
        int d=in.nextInt();
        int step = 0;
        double len=Math.sqrt(x*x+y*y);
        if(d==len){
            step=1;
        }
        if(d>len){
            step=2;
        }
        if(d<len){
            step=(int)len/d;
            if(d*step!=len){
            step+=1;
            }
        }
        System.out.println(step);
    }
}
