package report;
import transactions.account;
public class transactionreport{
   public static void generateReport(account acc)
      {
         System.out.println("account number"+acc.accno+"balance"+acc.bal);
      }
}