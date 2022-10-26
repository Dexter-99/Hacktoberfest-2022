import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s: str){
            char[] ch= s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted))
                map.put(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        for(List<String> list: map.values())
            result.add(list);
        return result;
    }
}
