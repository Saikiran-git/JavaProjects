package CountOfEachWords;

//import the necessary packages if neededimport java.util.*;
import java.util.HashMap;
import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class CountOfWords
{
  @SuppressWarnings({ "rawtypes", "resource" })
public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Student's Article");
      String st = sc.nextLine();
      String[] str = st.split("[?!;,:. ]+");
      HashMap<String, Integer> map = new HashMap();
      for(String s : str){
          s = s.toLowerCase();
          
          if(!map.containsKey(s))
              map.put(s, 1);
              
          else{
              int count = (int)map.get(s);
              count++;
              map.put(s, count);
          }
      }
      System.out.println("Number of words "+str.length+"\nWords with the count");
      Set<String> key = map.keySet();
      List<String> keyList = new ArrayList<String>(key);
      Collections.sort(keyList);
      for(String s : keyList)
          System.out.println(s+": "+map.get(s));
  }
}
