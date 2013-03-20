package transferfromstring;

public class TransferFromString {
static public int numpow(int pow){
    int num=2;
    if (pow == 0) {
            return num = 1;
        }
    pow--;
    return numpow( pow) * num;
}
    public static void main(String[] args) {
       String str="11111";
       System.out.print("Строка с двоичным числом "+str+"\n");
       int len=str.length()-1;
       int res=0;
      for(int i=0;i<=str.length()-1;i++,len--){
           if(((int)str.charAt(i)-48)>0) {
               res+=((int)str.charAt(i)-48)*numpow(len);
           }
       }
       System.out.print("В десятичной системе "+res+"\n");
    }
}
