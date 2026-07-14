class Patterns4{
    public void CountInt(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Patterns4 p = new Patterns4();
        p.CountInt(5);
    }
}
