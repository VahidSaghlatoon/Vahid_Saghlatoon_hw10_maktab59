import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard {

    public static void main(String[] args) {

        List<Number> numberList = new ArrayList<>(Arrays.asList(2,2.4,3.8,5));
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,5));
        //upper bounded
        System.out.println("sum is : " + WildCard.total(numberList) );
        //lower bounded
        WildCard.totalOnlyInteger(numberList);


    }
    //upper bounded wildCard
    public static double total(List<? extends Number> numberList){
        double sum = 0 ;
        for (Number number : numberList)
        {
            sum+= number.doubleValue();
        }
        return sum ;
    }

    //lower bounded wildCard
    public static void totalOnlyInteger(List<? super Integer> numberList){

        System.out.println(numberList);
    }

    //unbounded wildCard
    public static void totalOpen(List<?> list){
        System.out.println(list);
    }
}
