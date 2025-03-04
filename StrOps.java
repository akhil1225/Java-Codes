import java.util.Arrays;

public class StrOps {
    public static void main(String... args){
        String st= "Hello World";
        System.out.println(st.charAt(7));
        String con= st.concat(" "+st);
        System.out.println(con);
        String sb = con.substring(2,20);
        System.out.println(sb);
        System.out.println(con.indexOf("-z"));
        String lc= con.toLowerCase();
        String uc= con.toUpperCase();
        System.out.println(lc+"  "+uc);
        String pd = "                Byee World";
        System.out.println(pd.trim());
        System.out.println(pd.replace("ye","Haii"));
        System.out.println(pd.startsWith(" "));
        System.out.println(pd.endsWith("d"));
        String arr= con.concat(pd);
        String arr2= arr.concat(uc);
        String arr3= arr2.concat(lc);
        String arr4= arr3.concat(sb);
   
        String[] arr5 = arr4.split(" ");
        System.out.println(Arrays.deepToString(arr5));
      for(String x : arr5){
           System.out.print(x+" ");}
           System.out.println();
        int[] array= {1,2,3,4,5,6};
        for(int x: array){
            System.out.print(x);
        }
;        
    }
    
}
