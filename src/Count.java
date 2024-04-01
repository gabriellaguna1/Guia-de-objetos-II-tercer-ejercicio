import java.util.UUID;

public class Count {
    private String ID= UUID.randomUUID().toString().toUpperCase().substring(0,6);
    private Double balance;
    private Client client;

    public Count() {
    }

    public Count(Double balance, Client client) {
        this.balance = balance;
        this.client = client;
    }

    public String getID() {

        return ID;
    }

    public void setID(String ID) {

        this.ID = ID;
    }

    public Double getBalance() {

        return balance;
    }

    public void setBalanceDepositar(Double balance) {
       this.balance+=balance;
    }
    public void setBalanceExtraer(Double balance) {

        if(balance>this.balance && (this.balance-balance)<-2000){
            System.out.println("Saldo insuficiente para realizar esta transaccion");
        }else{
            this.balance -= balance;
        }
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}