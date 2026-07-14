class Patterns7{
    public void patterns(int n){
        for(int i = n; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print(j+"");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Patterns7 p = new Patterns7();
        p.patterns(5);
    }
}