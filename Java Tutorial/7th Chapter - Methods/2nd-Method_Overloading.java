
class Over{
    static void tell(){
        System.out.println("Helloo yaar");
    }
        // Value only change in Arrays
    // static void change(int a){
    //     a = 645;
    // }
    // static void change2(int[] a){
    //     a[1] = 645;
    // }

    // methodover loading
    static void foo(){
        System.out.println("Good Morning broo");
    }
    static void foo(String n){
        System.out.println("Good Morning "+n);
    }
    public static void main(String[] args) {
        tell();
        // int a =7;
        // change(a);
        // System.out.println(a);

        // int [] marks = {34,44,32,44,33};
        // change2(marks);
        // System.out.println(marks[1]);

        foo();
        foo("Ankit");

    }
}