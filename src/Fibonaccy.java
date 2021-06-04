public class Fibonaccy {
        public static void main(String[] args) {
            System.out.println("Day so Fibonacci:");
            int n1 = 0, n2 = 1, n3;
            int i;
            int count;
            String series1="";
            series1 = n1 + " " + n2 + " ";

            String series2="";
            count=26;
            for (i = 2; i < count; ++i) { //loop starts from 2 because 0 and 1 are already printed//2,3,4,5,6
                n3 = n1 + n2;//n3=0+1=1;1+1=2;1+2=3;2+3=5;3+5=8;
                series2 += n3 + " ";//s=1 ;=1 2 ;=1 2 3 ;
                n1 = n2;//n1=1;1;2;3;5;
                n2 = n3;//n2=1;2;3;5;8;
            }
            System.out.print(series1 + series2);//s=1 ;=1 2 ;=1 2 3 ;
        }
}
