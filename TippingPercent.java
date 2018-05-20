
package Cashout;

/**
 * 
 * @author BradNissen
 */

public class TippingPercent
{
    // Variables Are Private
    private final double VISA_PERCENT = 1.8/100.0;
    private final double BAR_PERCENT = 5.5/100.0;
    private final double BUSSER_PERCENT = 2.0/100.0;
    private final double EXPO_PERCENT = 1.5/100.0;
    private final double HOST_PERCENT = 1.0/100.0;
    private final double KITCHEN_PERCENT = 1.0/100.0;
    private final double TRANSFER_PERCENT = 15/100.0;
    
    public double getVisa() {
        return VISA_PERCENT;
    }

    public double getBar() {
        return BAR_PERCENT;
    }

    public double getBusser() {
        return BUSSER_PERCENT;
    }

    public double getExpo() {
        return EXPO_PERCENT;
    }

    public double getHost() {
        return HOST_PERCENT;
    }

    public double getKitchen() {
        return KITCHEN_PERCENT;
    }
    
    public double getTransfer() {
        return TRANSFER_PERCENT;
    }
    
}
    
