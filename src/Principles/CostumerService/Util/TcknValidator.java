package Principles.CostumerService.Util;

public class TcknValidator implements Validator{
    /**
     * This method validate tckn.
     * @param tckn
     */
    @Override
    public void validate(String tckn) {
        if(tckn == null || tckn.length()==0){
            throw new IllegalArgumentException("empty tckn");
        }
        String length=ATMProperties.getProperty("customer.tckn.length");
    }
}
