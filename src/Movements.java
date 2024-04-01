public class Movements {
    Client name;
    Double amount;

    public Movements(Client name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    public Client getName() {
        return name;
    }

    public void setName(Client name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
