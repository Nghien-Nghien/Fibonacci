public class Fibonaccy {
        public static void main(String[] args) {
            System.out.println("Day so Fibonacci:");
            int n1 = 0;
            int n2 = 1;
            int n3;
            int count;

            String series="";
            count=26;
            for (int i = 2; i < count; ++i) { //loop starts from 2 because 0 and 1 are already printed//2,3,4,5,6
                n3 = n1 + n2;//n3=0+1=1;1+1=2;1+2=3;2+3=5;3+5=8;
                series += n3 + " ";//s=1 ;=1 2 ;=1 2 3 ;
                n1 = n2;//n1=1;1;2;3;5;
                n2 = n3;//n2=1;2;3;5;8;
            }
            System.out.print(0 + " " + 1 + " " + series);//s=1 ;=1 2 ;=1 2 3 ;
        }
}
