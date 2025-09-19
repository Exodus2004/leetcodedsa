class Spreadsheet {
    Map<String,Integer> map;

    public Spreadsheet(int rows) {
        map = new HashMap<>();
        
    }
    
    public void setCell(String cell, int value) {
        map.put(cell,value);
        
    }
    
    public void resetCell(String cell) {
        map.put(cell,0);
        
    }
    
    public int getValue(String formula) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        int i =1;
        while(true){
            if(formula.charAt(i)=='+') break;
            a.append(formula.charAt(i));
            i++;
        }
        i++;
        while(i<formula.length()){
            b.append(formula.charAt(i));
            i++;
        }
        
        int val =0;
        if(Character.isDigit(a.charAt(0))){
            val+=Integer.parseInt(a.toString());
            

        }
        else val+=map.getOrDefault(a.toString(),0);
        if(Character.isDigit(b.charAt(0))){
            val+=Integer.parseInt(b.toString());
            

        }
        else val+=map.getOrDefault(b.toString(),0);
        return val;
        
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */