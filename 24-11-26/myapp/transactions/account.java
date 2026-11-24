package transactions;
public class account{
   public int accno;
   public int bal;
   public  account(int a, int b){
      accno=a;
      bal=b;
   }
   public void deposit(int a){
      System.out.println("bal before:"+bal);
      bal=bal+a;
      
      System.out.println("balance :" + bal +"deposited" + a);
   }
   public void withdrawl(int a){
      if(a < bal){
         bal=bal-a;
         System.out.println("balance"+bal+"withdrawn"+a);
      }
      else{
         System.out.println("insufficient balance");
      }
   }
}
   
