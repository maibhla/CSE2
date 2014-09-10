public class Arithmetic {
    public static void main(String [] args) {
        int nSocks=3; //number of socks
        int nGlasses=6; // number of glasses
        int nEnvelopes=1; // number of envelopes
        double sockCost=2.58,  // costs for each item
        glassCost=2.29,
        envelopeCost=3.25,
        taxPercent=.06;
        double taxlessSockCost, taxlessGlassCost, taxlessEnvelopeCost, //all calculated values
        sockTax, glassTax, envelopeTax, totalTax, totalTaxless, totalCost;
        taxlessSockCost = (nSocks*sockCost);  //calculate sock cost without tax
        taxlessGlassCost = (nGlasses*glassCost); //calculate glass cost wihout tax
        taxlessEnvelopeCost = (nEnvelopes*envelopeCost); // calculate envelope cost without tax
        sockTax = taxlessSockCost * taxPercent; // calculate tax on all items
        glassTax = taxlessGlassCost * taxPercent;
        envelopeTax = taxlessEnvelopeCost *taxPercent;
        int intermediarySockTax = (int)(sockTax*100);  // create nice 2 decimal point values for each tax total
        int intermediaryGlassTax = (int) (glassTax*100);
        int intermediaryEnvelopeTax = (int) (envelopeTax*100);
        double lastSockTax = intermediarySockTax / 100.00;
        double lastGlassTax = intermediaryGlassTax / 100.00;
        double lastEnvelopeTax = intermediaryEnvelopeTax / 100.00;
        totalTaxless = taxlessEnvelopeCost + taxlessGlassCost + taxlessSockCost; //calculate total cost without tax
        totalTax = lastSockTax + lastGlassTax + lastEnvelopeTax; // calculate total cost of tax
        totalCost = totalTax + totalTaxless; // calculate total cost
        int intermediaryTotalTaxless = (int) (totalTaxless*100);  // create a nice 2 decimal point version of total cost before tax
        double lastTotalTaxless = intermediaryTotalTaxless / 100.00;
         int intermediaryTotalCost = (int) (totalCost*100);  // create a nice 2 decimal point version of total cost before tax
        double lastTotalCost = intermediaryTotalCost / 100.00;
        
        System.out.println("Socks");   // print all information about socks
        System.out.println(+(nSocks)+ " Socks");
        System.out.println("$" +(sockCost)+ " per Sock");
        System.out.println("$" +taxlessSockCost+ "  total Sock cost without tax");
        System.out.println("$" +lastSockTax+ "  additional cost from tax on Socks");
        //print information about drinking glasses
        System.out.println("Drinking Glasses");
        System.out.println(+nGlasses+ "  Drinking Glasses");
        System.out.println("$" +glassCost+ "  per Drinking Glass");
        System.out.println("$" +taxlessGlassCost+ "  total Drinking Glasses cost without tax");
        System.out.println("$" +lastGlassTax+ "  additional cost from tax on Drinking Glasses");
        //print information about envelopes
        System.out.println("Envelopes");
        System.out.println(+(nEnvelopes)+ " Envelopes");
        System.out.println("$" +(envelopeCost)+ "  per Envelope");
        System.out.println("$" +taxlessEnvelopeCost+ "  total Envelopes cost without tax");
        System.out.println("$" +lastEnvelopeTax+ "  additional cost from tax on Envelopes");
        System.out.println("Total Cost before tax");
        System.out.println("$" +lastTotalTaxless+"");
        System.out.println("Total Cost of tax");
        System.out.println("$" +totalTax+"");
        System.out.println("Total Cost with tax");
        System.out.println("$" +lastTotalCost+"");
        
    }
}
    