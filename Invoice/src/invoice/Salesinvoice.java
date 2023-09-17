package invoice;

public class Salesinvoice {
    public static void main(String[] args) {
        String[] customer = {"C026-01-0934/2022", "28/04/2020", "Kyalo Samuel Kamau", "0100100100"};
        int[] quantity = {4, 10, 9, 10};
        String[] item = {"Pencil", "Duster", "Pens", "crayon"};
        int[] unitPrice = {20, 50, 30, 80};
        double[] amount = new double[quantity.length];
        double subtotal = 0;
        double vat;
        double total;
        
        for (int i = 0; i < quantity.length; i++) {
            amount[i] = quantity[i] * unitPrice[i];
            subtotal += amount[i];
        }
        vat = 0.16 * subtotal;
        total = subtotal + vat;
        
        System.out.println("*********************Adamson Computers Ltd****************************");
        System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City  *  Tel. No:123-4567");
        System.out.println("                 VAT REG. TIN 098-765-4321-0000");
        System.out.println("                         SALES INVOICE");

        System.out.println("Sold to: " + customer[0] + "                     Date: " + customer[1]);
        System.out.println("Address: " + customer[2] + "                    Contact Number: " + customer[3]);
        System.out.println("");
        System.out.println("");
        System.out.println("==========================================================================");
        System.out.println("Qty      |    Item Description    |    Unit Price    |Amount");
        System.out.println("==========================================================================");
        System.out.printf("" + quantity[0] + "        |    " + item[0] + "              |    " + unitPrice[0] + "            |%.2f\n", amount[0]);
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("" + quantity[1] + "       |    " + item[1] + "              |    " + unitPrice[1] + "            |%.2f\n", amount[1]);
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("" + quantity[2] + "        |    " + item[2] + "                |    " + unitPrice[2] + "            |%.2f\n", amount[2]);
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("" + quantity[3] + "       |    " + item[3] + "              |    " + unitPrice[3] + "            |%.2f\n", amount[3]);
        System.out.println("==========================================================================");
        System.out.printf("                                      |Sub Total     |%.2f\n", subtotal);
        System.out.println("                                       ===================================");
        System.out.printf("                                      |VAT(16%%)      |%.2f\n", vat);
        System.out.println("                                       ===================================");
        System.out.printf("                                      |Total Amount  |%.2f\n", total);
        System.out.println("                                       ===================================");
    }
}
