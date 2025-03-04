public class TestGarbage1 {
    public void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String args[]) {
       
        System.gc();
        

    }
}
