class Budget{
    private int income;
    private int TotalBudget;
    public Budget(){

    }
    public int Gincome(){
        return income;
    }
    public void Sincome(int x){
        this.income=x;
    }
    public int GTotalBudget(){
        return TotalBudget;
    }
    public void STotalBudget(int x){
        this.TotalBudget=x;
    }
    public void moneyIn(int v){
        income+= v ;
        TotalBudget+=v ;
    }
}
