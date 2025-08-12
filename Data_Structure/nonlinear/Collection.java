package nonlinear;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

 public class Collection{
     public static void main(String[] args){
          Map<Integer,String> hm=new HashMap<>();
          Map<Integer,String> lhm=new LinkedHashMap<>();
          Map<Integer,String> tm=new TreeMap<>();
          
          hm.put(0,"hiiii");
          hm.put(1,"hiiiiiiiiiiiiiiiiiiiii");
          hm.put(0,"hiiii");
          hm.put(0,"hiiii");
          hm.put(0,"hiiii");
          hm.put(0,"hiiii");
          System.out.println(hm.get(1));
     }
 } 