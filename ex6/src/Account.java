public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        return amount+getBalance();
    }

    public int debit(int amount){
        if(amount <= getBalance()){
            balance-=amount;
        }
        else{
            System.out.println("Amount balance exceeded.");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.credit(amount);
        }
        else{
            System.out.println("Amount balance exceeded.");
        }
        return this.balance;
    }

    @Override
    public String toString(){
        return "Account[id="+getId()+",name="+getName()+",balance="+getBalance()+"]";
    }
}
