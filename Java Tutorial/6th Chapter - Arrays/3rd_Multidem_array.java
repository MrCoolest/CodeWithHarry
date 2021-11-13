class Mul{
    public static void main(String[] args) {
        // int[] Arr = new int[6]; // 1-D Array 

        int [][] flat ={ {0,1,2,3,4,5,6}, {20,21,22,23,24,25,26}}; // 2-D Array

        for(int i = 0; i < flat.length; i++ ){
            for(int j = 0; j< flat[i].length ; j++ ){
                System.out.print(flat[i][j]+" ");
            }
            System.out.println();
        }

    }
}