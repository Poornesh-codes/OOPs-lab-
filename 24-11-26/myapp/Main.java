import transactions.account ;
import report.transactionreport;
public class Main{
   public static void main(String[] args){
      account myA = new account(232,60000);
      myA.deposit(10000);
      myA.withdrawl(20000);
      
     transactionreport.generateReport(myA);
     }
 }