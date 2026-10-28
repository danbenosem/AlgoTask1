import java.util.Arrays;

public class SquaredAscendingOrder {




    public static int [] getSquaredOder(int [] array){
        int [] newArray= new int[array.length];

         for(int index=0; index<array.length; index++){

             for(int index2=0; index2<array.length; index2++){

                 if(array[index]<array[index2]){
                     int temp=array[index];
                     array[index]=array[index2];
                     array[index2]=temp;

                 }
             }
         }

         for(int index=0; index<array.length; index++){
             array[index]=array[index]*array[index];
         }


         return array;
    }
}
