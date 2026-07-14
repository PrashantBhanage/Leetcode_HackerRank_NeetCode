class Patterns3{
    public void CountInt(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Patterns3 p = new Patterns3();
        p.CountInt(5);
    }
}
