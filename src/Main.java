public class Main {
    public static void main(String[] args) {
        double[] numbers = {-15.3, 5.2, 4.5, -4.5, 4.3, -4.3, 4.5, 5.4, -5.3, 4.3, -4.4, 1.2, -2.1, 4.3, 12.1};
        int positive = 0;
        double a = 0;
        for (double dub : numbers) {
            if (dub > 0) {
                positive++;
                a += dub;
            }
        }
        System.out.println(a / positive);

        double f=0;
        for (int i=0; i< numbers.length;i++){
            for (int j=i+1; j<numbers.length; j++){
                if (numbers[i]>numbers[j]){
                    f= numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=f;

                }
            }
            System.out.println(numbers[i]);
        }



    }
}