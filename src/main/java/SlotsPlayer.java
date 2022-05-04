public class SlotsPlayer {
    private int balance;
    private String name;

    public SlotsPlayer(){
        this("",1);
    }

    public SlotsPlayer(String name, int balance){
        this.name=name;
        this.balance=balance;
    }

    public boolean applyBet(int bet){
        if (bet<=balance)
            balance-=bet;
        return true;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int wins(Integer bet) {
        balance+=bet*2;
        return balance;
    }
}