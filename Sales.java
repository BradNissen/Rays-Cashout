package Cashout;

/**
 * Class: Sales
 *
 * Sales will get the sales when the user calls to setter methods. The variables
 * are private so they need to set or gotten from the method. when the getter is
 * called. It will return the calculation of the percentage back. Quite simple.
 *
 * @author BradNissen
 */
public class Sales {
    private double bevSales;
    private double foodSales;
    private double expoSales;
    private double visaTips;
    private double cashTips;
    private double netTips;
    private double amFoodSales;
    private double amBevSales;
    private double amExpoSales;

    TippingPercent percents = new TippingPercent();

    /**
     * Sales [Default Constructor]
     *
     * This is a default constructor which sets the sales from when the user
     * wants to change them from a class call.
     *
     * @param
     * @return
     */
    public Sales() {
        bevSales = 0;
        foodSales = 0;
        expoSales = 0;
        visaTips = 0;
        cashTips = 0;
        netTips = 0;
        amFoodSales = 0;
        amBevSales = 0;
        amExpoSales = 0;
    }

    public void setNetTips(double x) {
        netTips = x;
    }

    public void setCashTips(double x) {
        cashTips = x;
    }

    public void setVisaTips(double x) {
        visaTips = x;
    }

    public void setBevSales(double x) {
        bevSales = x;
    }

    public void setFoodSales(double x) {
        foodSales = x;
    }

    public void setExpoSales(double x) {
        expoSales = x;
    }

    public void setAmFoodSales(double x) {
        amFoodSales = x;
    }

    public void setAmBevSales(double x) {
        amBevSales = x;
    }

    public void setAmExpoSales(double x) {
        amExpoSales = x;
    }

    public double getBevSales() {
        return bevSales;
    }

    public double getFoodSales() {
        return foodSales;
    }

    public double getExpoTips() {
        double ExpoTipout = expoSales * percents.getExpo();
        return ExpoTipout;
    }

    public double getVisaTips() //ccTips
    {
        double visaTipout = visaTips * percents.getVisa();
        return visaTipout;
    }

    public double getAmBarTips() {
        double amBarTipout = amBevSales * percents.getBar();
        return amBarTipout;
    }

    public double getAmHostTips() {
        double amhostTipout = (amBevSales + amFoodSales) * percents.getHost();
        return amhostTipout;
    }

    public double getAmBusserTips() {
        double ambusserTipout = (amBevSales + amFoodSales) * percents.getBusser();
        return ambusserTipout;
    }
    
    public double getAmExpoTips() {
        double amExpoTipout = amExpoSales * percents.getExpo();
        return amExpoTipout;
    }

//    public double getKitchenTips() {
//        double kitchenTipout = foodSales * percents.getKitchen();
//        return kitchenTipout;
//    }

    public double getBarTips() {
        double barTipout = bevSales * percents.getBar();
        return barTipout;
    }

    public double getHostTips() {
        double hostTipout = (foodSales + bevSales) * percents.getHost();
        return hostTipout;
    }

    public double getBusserTips() {
        double busserTipout = (foodSales + bevSales) * percents.getBusser();
        return busserTipout;
    }

    public double getCashTips() {
        return cashTips;
    }
    
    public double allTips()
    {
        return    getExpoTips()   + getAmExpoTips()
                + getBarTips()    + getAmBarTips() 
                + getHostTips()   + getAmHostTips()
                + getBusserTips() + getAmBusserTips()
                + getVisaTips();
    }
    
//    public void setTipsMade(double x)
//    {
//        
//    }
//    public  double getTipsMade()
//    {
//        return netTipsAfterTipout;
//    }

    public double getNetTips() {
        double netTipsAfterTipout = netTips + allTips();

////        if (netTips >= 0) //owe money
////        {
////            double due = netTips + allTips();
////            
////            //taking the money you owe plus the tips. taken from the cash. 
////            //then setting the cash to what you have left, you want with.
////            netTipsAfterTipout = getCashTips() - due;
////            
////            return netTipsAfterTipout;  //cash left over - tipout
////
////        } 
////         if (netTips < 0) {
////            //its negative, so you dd the time. if +, then you make that plus the cash, other wise you owe cash..
////            double due = netTips + allTips();
////            
////            if (due >= 0){
////                netTipsAfterTipout = getCashTips() - due;
////                return netTipsAfterTipout;            
////            }
////            if (due < 0)
////                return netTipsAfterTipout;
////     
//            
//            netTipsAfterTipout = (netTips) +(allTips());
//            
//            if (netTipsAfterTipout > 0) {
//                netTipsAfterTipout = cashTips - netTipsAfterTipout;
//                setCashTips(netTipsAfterTipout);
//            }
//        }
        return netTipsAfterTipout;
    }

}
