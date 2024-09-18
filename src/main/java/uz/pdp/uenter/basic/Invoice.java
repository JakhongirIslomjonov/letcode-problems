package uz.pdp.uenter.basic;

// Invoice class
public class Invoice {

    // Instance variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor to initialize instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0; // Set to 0 if quantity is negative
        }
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0; // Set to 0.0 if price is negative
        }
    }

    // Getter and Setter methods for partNumber
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    // Getter and Setter methods for partDescription
    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    // Getter and Setter methods for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    // Getter and Setter methods for pricePerItem
    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // Method to calculate the invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    // Main method to test the Invoice class
    public static void main(String[] args) {
        // Create an Invoice object
        Invoice invoice = new Invoice("A123", "Screwdriver", 5, 3.5);

        // Display invoice details
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}
