
package stringdestroy;

import java.util.Scanner;

public class StringDestroy {

 /*   static String cutSubstr(String str, String substr) 
    {
        int first_index = str.indexOf(substr);
        if (first_index != -1) {
            int word_length = substr.length();
            String first_part = str.substring(0, first_index);
            String second_part = str.substring(first_index + word_length, str.length());
            str = first_part + second_part;   
        } 
        return str;
}*/
    public static void main(String[] args) {
       int str_len=0;
       Scanner in = new Scanner(System.in);
       String st =in.nextLine();
       str_len=st.length();
       int n=in.nextInt();
       int word_len=0;
       /*int res = 32000;*/
       String[] q=new String[n+1];
       for(int i=0;i<n+1;i++){
           q[i]=in.nextLine();
           word_len=q[i].length();
       }
       int res=str_len/word_len;
       System.out.println(res);
       /*q[0]="aba";
       q[1]="aca";
       q[2]="ada";
       q[3]="abb";*/
      /* String temp = st;
       boolean flag = true;
       int temp_length;
       while(flag) {
       temp = st;
           for(int w_iter = 0; w_iter < n; w_iter++) {
               temp_length = temp.length();
               temp = cutSubstr(temp, q[w_iter]);
               if (temp.length() < temp_length) {
                  for (int i = 0; i < n; i++) {
                      temp = cutSubstr(temp, q[i]);       
                  }
              }
               if(temp.length() == 0) flag = false;
          }
          
       }
        System.out.println(st);*/
    } 
    
}
