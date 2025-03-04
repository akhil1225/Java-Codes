class one{
    public static int returnSomething(){
        try{
            return 10;
        }finally{
            return 20;
        }
    }

    public static void main(String... args){
        int res = returnSomething();
        System.out.println(res);
    }
}