package Q2;

import java.util.Scanner;

public class ProcessInvoice {
  private Product[] items;
  private Customer[] customers;
  private Scanner scn = new Scanner(System.in);
  
  private void initializeProducts() {
    //todo:: create sample products  
    
  }
  
  private void initializeCustomers() {
      //todo: create sample customers

  }
  
  public int selectCustomers() {
    System.out.println("\nCustomers:");
    for (int i = 0; i < customers.length; ++i) {
      System.out.printf("%-3s %-8s %-20s\n", (i+1)+".", customers[i].getId(), customers[i].getName());
    }
    System.out.print("Select customer [1.." + (customers.length) + "]: ");
    int choice = scn.nextInt();
    return choice-1;
  }
  
  
  
  public void enterInvoiceLines(Invoice invoice) {
    char anymore = 'Y';
    do {
      System.out.println("\nProducts");
      
      for (int i = 0; i < items.length; ++i) {
        System.out.printf("%-3s %-8d %-15s RM%8.2f\n", (i+1)+".", items[i].getNumber(), items[i].getDescription(), items[i].getPrice());
      }
      
      System.out.print("Enter product [1.." + items.length + "]: ");
      int selection = scn.nextInt()-1;
      System.out.print("Enter quantity: ");
      int quantity = scn.nextInt();

      //todo:: add invoice line
      System.out.print("Anymore items (Y/N)? ");
      
      anymore = Character.toUpperCase(scn.next().charAt(0));
    } while (anymore == 'Y');
  }
  
  
  public Invoice enterSale() {
    System.out.println("\n\nProcess Sale");
    int customerIndex = selectCustomers();
    
    //todo:: create new invoice
  
    //todo:: enter invoice lines
   
    return invoice;
  }

  public static void drawLine() {
    for (int i = 0; i < 71; ++i)
      System.out.print("-");
    System.out.println();
  }

  public static void displayHeader() {
    System.out.printf("%-10s %-20s %-8s %-15s %-15s\n", "Product No", "Description", "Qty", "Unit Price(RM)", "Line Total(RM)");
  }
  
  public static void generateInvoice(Invoice inv) {
    //todo:: generate invoice
  }

  public ProcessInvoice() {
    initializeProducts();
    initializeCustomers();
    
    Invoice inv = enterSale();
    generateInvoice(inv);
  }


  public static void main(String[] args) {
    new ProcessInvoice();
  }
}
