public class MaxMin {
    public static void main(String[] args){
        int[] a={12,30,60};
        int Min = a[0];
        int Max = a[0];
        for(int i=0;i<a.length;i++) {

            if (a[i] > Max) {
                Max = a[i];
            } else if (a[i] < Min) {
                Min = a[i];
            }
        }
            System.out.println("Max: "+Max);
            System.out.println("Min: "+Min);


    }
}
