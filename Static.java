public class Static {
     static int a = 3, b = 4;
    public static void main(String[] args){
        //static variable , method  can directly access in static method , as seen static variable a and b are accessible in static ,method add.
        add();
    }
    public static void add(){
        int c;
        c = a + b;
        System.out.println(c);
    }
}
