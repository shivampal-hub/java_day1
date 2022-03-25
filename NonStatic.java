public class NonStatic {
    int a = 3, b = 4;
    public static void main(String[] args){
        //non-static var,method cant directly access in static method,need to create object, in this case method add cant be accessed directly in main class due to which object is created.
        NonStatic S = new NonStatic();
        S.add();
    }
    public void add(){
        int c;
        c = a + b;
        System.out.println(c);
    }
}
