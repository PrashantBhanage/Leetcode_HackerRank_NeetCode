class Patterns2{
    public void CountInt(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Patterns2 p = new Patterns2();
        p.CountInt(5);
    }
}
