class Each{
    public static void main(String[] args) {
        int[] mar = {21,22,23,24,25,26};

        System.out.println("Printing Arrays");
        for(int i = 0; i<mar.length ; i++){
            System.out.println(mar[i]);
        }
        System.out.println("Printing Arrays in reverse order");
        for(int i = mar.length-1 ; i>=0 ; i--){
            System.out.println(mar[i]);
        }
        
        
        System.out.println("Printing For each loop ");
        for (int i : mar) {
            System.out.println(i);
        }
    }
}