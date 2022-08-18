public class waiter {
        private String name;
        private int tableNumber;

        public waiter(String newName, int NewTableNumber) {
            this.tableNumber = NewTableNumber;
            this.name = newName;
        }
    
        public String getName() {
            return this.name;
        }
    
        public void setNewTableNumber(String newName) {
            this.name = newName;
        }

        public void setTableNumber(int NewTableNumber) {
            tableNumber = NewTableNumber;
        }

        int getTableNumber() {
            return tableNumber;
        }

    }
