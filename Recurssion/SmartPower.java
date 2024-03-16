public class SmartPower{

    public int power(int a, int N){
        if(N == 1)
            return a;
        return (a * this.power(a, N-1));
    }

    public int optimizedPower(int a, int N){
        if(N == 0)
            return 1;
        int temp = this.optimizedPower(a, N/2);
        if(N % 2 == 0){
            return temp * temp;
        }
        else{
            return temp * temp * a;
        }
    }
    public static void main(String[] args) {
        SmartPower smartPower = new SmartPower();
        System.out.println(smartPower.power(2, 3));
        System.out.println(smartPower.optimizedPower(2, 3));
    }
}
