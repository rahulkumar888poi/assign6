
class static1 {
    static int i;
    int j;
     
    
    static {
        i = 10;
        System.out.println("static block called ");
    }
    
}
 

    public static void main(String args[]) {
 
       
        System.out.println(static1.i); 
    }
