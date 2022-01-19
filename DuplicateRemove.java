import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class DuplicateRemove{
       public static void main(String[] args){
List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,1,1,2));
List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
System.out.println(newList);
}
}