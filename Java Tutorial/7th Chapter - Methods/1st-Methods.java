class Method{
    static void tellSomething(){
        System.out.println("I'm a Brilliant person!");
    } 
   static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a =5;
        int b = 7;
        int c = logic(a, b);
        // Method obj = new Method();
        // int c = obj.logic(a, b);

        int a1 = 7;
        int a2 = 3;
        int c1= logic(a1, a2);
        // int c1 =obj.logic(a1,a2);

        System.out.println(c);
        System.out.println(c1);
        tellSomething();
    }
}