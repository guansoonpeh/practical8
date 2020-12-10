package Q2;

import java.util.Calendar;

public class Invoice {
    private String invoiceNumber;
    private Calendar date;
    private Customer customer;
    private InvoiceLine[] lines;
    private int totalLines;
    private static int nextInvoiceNumber =  1;
    
    public Invoice() {
         this.invoiceNumber = "INV" + String.format("%04d", nextInvoiceNumber++);
         this.date = Calendar.getInstance();
    }

    public Invoice(Customer customer, InvoiceLine[] lines) {
        this.invoiceNumber = "INV" + String.format("%04d", nextInvoiceNumber++);
        this.date = Calendar.getInstance();
        this.customer = customer;
        this.lines = lines;
        this.totalLines = lines.length;
    }
    
     public Invoice(Customer customer) {
        this.invoiceNumber = "INV" + String.format("%04d", nextInvoiceNumber++);
        this.date = Calendar.getInstance();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public InvoiceLine[] getLines() {
        return lines;
    }

    public void setLines(InvoiceLine[] lines) {
        this.lines = lines;
        this.totalLines = lines.length;
    }
    
    public void addLine(InvoiceLine lines){
        if (this.lines == null)
            this.lines = new InvoiceLine[10];
       
        this.lines[totalLines++] = lines;
    }
    
    public static String getNextInvoiceNumber() {
        return "INV" + String.format("%04d",nextInvoiceNumber);
    }

    public static void setNextInvoiceNumber(int nextInvoiceNumber) {
        Invoice.nextInvoiceNumber = nextInvoiceNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public Calendar getDate() {
        return date;
    }

    public String getFormattedDate(){
        String day = String.format("", date.DAY_OF_MONTH);
        String month = String.format("", date.MONTH); 
        String year  = String.format("", date.YEAR);
                
        return String.format("%s-%s-%s", day, month, year);
    }
    
    public int getTotalLines() {
        return totalLines;
    }
    
    public double getGrandTotal(){
        double total = 0.0;
    
        for(int i=0; i<lines.length; i++){
            total += lines[i].getPrice();
        }
        
        return total;
    }
    

//
//    public String toString(){
//        
//    }
//     
    
}
