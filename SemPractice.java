class CustExcep extends Exception{
    public CustExcep(String message){
        super(message);
    }
}

public class SemPractice {
    public static int performOp(int value) throws CustExcep{
        if(value <0){
            throw new CustExcep("Negative values not allowed"+" "+value);
        }else{
            return value;
        }

    }
    public static void main(String... args){
        int value= -5;
    try {
        int res= performOp(value);
        System.out.println("Result: "+res);
    } catch (CustExcep e){
        System.out.println("Custom Exception occured: "+e.getMessage());
    }
}
}