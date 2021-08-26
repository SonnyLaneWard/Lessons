import java.util.Arrays;

public class MaxMin {
    public static void bubblesort(double[] arr)
    {
        double temp;
       boolean sorted = false;
       while (!sorted){
           sorted = true;
           for (int i = 0; i < arr.length - 1; i++)
           {
            if (arr[i] > arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                sorted = false;

            }
           }
       }


    }
   public static double SUM(double[] arr)
   {
      double s = 0;
       for (double v : arr) {
           s = s + v;
       }

       return s;
   }




    public static void main(String[] args) {
        double [] ranarray = new double[10];
        for (int i = 0; i < ranarray.length; i++)
        {
          ranarray[i] = Math.random();

        }
        System.out.println("Begin");
        System.out.println(Arrays.toString(ranarray));
        System.out.println("Sorted");
        bubblesort(ranarray);
        System.out.println(Arrays.toString(ranarray));
        double Min = ranarray[0];
        double Max = ranarray[ranarray.length-1];
        double Avv = SUM(ranarray) / ranarray.length;
        System.out.println(Min);
        System.out.println(Max);
        System.out.println(Avv);








    }
}
