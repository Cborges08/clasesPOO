public class table {
    private int tableNumber;
    private boolean tableIsTaken ;

    public table(int NewTableNumber, boolean NewTableIsTaken) {
        this.tableNumber = NewTableNumber;
        this.tableIsTaken = NewTableIsTaken;
    }

    public int getTableNumber() {
        return this.tableNumber;
    }

    public void setNewTableNumber(int NewTableNumber) {
        this.tableNumber = NewTableNumber;
    }

    public void setTableIsTaken(){
        this.tableIsTaken = false;
    }

    public boolean getTableIsTaken() {
        return this.tableIsTaken;
    }
    

}
