public class SwappingVariables {

    public static void swapWithTemp(int a, int b){
        int temp = a;
        a = b;
	    b = temp;
	System.out.println("a: "+a+" b: "+b);	
    }

    public static void swapWithoutTemp(int a, int b){
	b = a+b;
	a= b - a;
	b= b-a;
	System.out.println("a: "+a+" b: "+b);	

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swapWithTemp(a, b);
        swapWithoutTemp(a, b);

    }
}
