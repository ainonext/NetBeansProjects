
package testing;

class Money {

     private int value;
     private String type;

     public Money(int v, String t){
          value = v;
          type = t;
     }

     public Money add(Money m){
          return new Money(value + m.getValue(), type);
     }

     public int getValue(){
          return value;
     }
}

public class Testing {

    public static void main(String[] args) {
   
    }
}
