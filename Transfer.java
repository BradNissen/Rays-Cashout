/*
   Transfter.class
will be able to deduct tax, and tip name whuch is user entered
*/
package Cashout;

public class Transfer 
{
    private double amount;
    private String name;
    private final double FIFTHTEEN_PERCENT = 15/100;

   public Transfer()
   {    
        double amount = 0;
        String name = "";
        
   }
   
   public void setAmount(double amount)
   {
       this.amount = amount;
       percentage(amount);
   }
   
   public double percentage(double amount)
   {
       double shit = ((amount/1.095)+.01)* FIFTHTEEN_PERCENT;
       return shit;
   }
   
   public double getAmount()
   {
       return amount;
   }
}
