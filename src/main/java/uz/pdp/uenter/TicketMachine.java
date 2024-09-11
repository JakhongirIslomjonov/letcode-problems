package uz.pdp.uenter;

public class TicketMachine {
    private double ticket;
    private double price;
    private double balance;

    public TicketMachine(double balance, double price, double ticket) {
        this.balance = balance;
        this.price = price;
        this.ticket = ticket;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTicket() {
        return ticket;
    }

    public void setTicket(double ticket) {
        this.ticket = ticket;
    }

    public void printTicket(){

           System.out.println(" bay ticket balance :" + balance);

    }
    public void insertMoney(double money) {
       setBalance(balance+money);

        if (balance >= price) {
            this.balance = balance - price;
            printTicket();
        }else {
            System.out.println("error balance need money");
        }


    }
}
