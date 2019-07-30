public class OverLoading {
    private static int x=10;
    private int y=20;

    public int sum(int a,int b){
        return a+b;

    }

    public int sum(int a,int b,int c){
        int sumAB=sum(a,b);

        return sumAB+c;
    }



    public static void main(String[] args) {

        OverLoading overLoading=new OverLoading();
        System.out.println(overLoading.sum(10,20,30));

    }
}
