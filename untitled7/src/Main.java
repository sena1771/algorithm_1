public class Main {
    public static void main(String[] args) {
        int[] Num = {1, 2, 3, 4,5};
        for(int i=0;i<5;i++) {
            for(int g=0;g<5;g++){
                System.out.print(Num[g]+" "); }
                System.out.println(" ");
            if(i==3) {
                Num[i] = Num[i] - 1;
                Num[i + 1] = Num[i + 1] - 1;
            for(int j=0;j<5;j++){
                System.out.print(Num[j]+" ");} break; }
           Num[i]--;}}}