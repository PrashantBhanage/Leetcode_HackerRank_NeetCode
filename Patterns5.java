class Patterns5{
    public void CountInt(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Patterns5 p = new Patterns5();
        p.CountInt(3);
    }
}
