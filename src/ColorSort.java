//Testing histogram example https://bitbucket.org/RedFox20/algo_homework1/src/c676a3a4942caada65c2f0cfa003d1fe183afcb7/src/Sheep.java?at=master&fileviewer=file-view-default

public class ColorSort {

   enum Color {
       red, green, blue;
       public static final Color[] Values = values();
       public static final int Max = Values.length;
   }
   
   public static void main (String[] param) {
      // for debugging
   }

    public static void countingSort(Color[] list)
    {
        int[] histogram = new int[Color.Max];

        for (Color a : list) // populate histogram
        {
            ++histogram[a.ordinal()];
        }

        // write out POD values
        for (int i = 0, out = 0; i < Color.Max; ++i)
        {
            Color a = Color.Values[i];
            for (int n = histogram[i]; n > 0; --n)
            {
                list[out++] = a;
            }
        }
    }


    public static void reorder (Color[] balls) {
       countingSort(balls);
   }

}

