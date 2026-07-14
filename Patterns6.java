class Patterns6{
    public void CountPat(int n){
        for(int i = n; i>=1; i--){
            for(int j = i; j>=1; j--){
                System.out.print("*");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        Patterns6 p = new Patterns6();
        p.CountPat(5);
    }
}
