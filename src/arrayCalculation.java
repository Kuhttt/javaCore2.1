/**
 * Created by Евгений on 31.01.2017.
 */
public class arrayCalculation {
    public static int max(int []array){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max)
                max=array[i];
        }
        return max;
    }
    public static double max(double []array){
        double max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max)
                max=array[i];
        }
        return max;
    }
    public static int min(int []array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static double min(double []array){
        double min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static int sum(int []array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static double sum(double []array){
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static int maxPositive(int []array){
        int max=0;
        for (int i=0;i<array.length;i++){
            if(array[i]<0)
                continue;
            else if(max<array[i])
                max=array[i];
        }
        return max;
    }
    public static double maxPositive(double []array) {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                continue;
            else if (max < array[i])
                max = array[i];
        }
        return max;
    }
    public static int multiplication(int []array){
        int mult=array[0];
        for(int i=1;i<array.length;i++){
            mult*=array[i];
        }
        return mult;
    }
    public static double multiplication(double []array){
        double mult=array[0];
        for(int i=1;i<array.length;i++){
            mult*=array[i];
        }
        return mult;
    }
    public static int modulus(int []array){
        int first=array[0],last=array[array.length-1];
        return first%last;
    }
    public static double modulus(double []array){
        double first=array[0],last=array[array.length-1];
        return first%last;
    }
    public static int secondLargest(int []array){
        int max=0,indexOfLargest=0;
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
                indexOfLargest=i;
            }
        }
        max=0;
        for(int i=0;i<array.length;i++){
            if(i==indexOfLargest)
                continue;
            else if(max<array[i])
                max=array[i];
        }
        return max;
    }
    public static double secondLargest(double []array){
        double max=0;int indexOfLargest=0;
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
                indexOfLargest=i;
            }
        }
        max=0;
        for(int i=0;i<array.length;i++){
            if(i==indexOfLargest)
                continue;
            else if(max<array[i])
                max=array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] iArray={1,23,-45,22,209,0,-33,10,8,-9};
        double []dArray={3.2,4.88,-0.12,444,555,-4653.1,5,98,-75.333};
        System.out.println(
                "Sum for int = "+sum(iArray)+"\n"+
                        "Sum for double = "+sum(dArray)+"\n"+
                        "============================="+"\n"+
                        "Max for int = " +max(iArray)+"\n"+
                        "Max for double = "+max(dArray)+"\n"+
                        "============================="+"\n"+
                        "Min for int = "+min(iArray)+"\n"+
                        "Min for double = "+min(dArray)+"\n"+
                        "============================="+"\n"+
                        "MaxPositive for int = "+maxPositive(iArray)+"\n"+
                        "MaxPositive for double = "+maxPositive(dArray)+"\n"+
                        "============================="+"\n"+
                        "Multiplication for int = "+multiplication(iArray)+"\n"+
                        "Multiplication for double = "+multiplication(dArray)+"\n"+
                        "============================="+"\n"+
                        "Modulus for int = "+modulus(iArray)+"\n"+
                        "Modulus for double = "+modulus(dArray)+"\n"+
                        "============================="+"\n"+
                        "SecondLargest for int = "+secondLargest(iArray)+"\n"+
                        "SecondLargest for double = "+secondLargest(dArray)
        );
    }

}
