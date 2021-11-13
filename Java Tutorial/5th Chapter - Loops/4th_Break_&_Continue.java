class BreakAndContinue{
    public static void main(String[] args) {
        // for(int i = 1; i<=5;i++){
        //     if(i==3){
        //         // break;
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        int j = 0;
        while(j<7){
            if(j==3){
                // break;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}