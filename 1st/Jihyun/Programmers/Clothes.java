import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothe = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            clothe.put(key, clothe.getOrDefault(key, 0) + 1);
        }
        
        Iterator<Integer> iter = clothe.values().iterator();
        
        while(iter.hasNext()) {
            answer *= iter.next().intValue() + 1;
        }
        
        return answer - 1;
    }
}

class Clothes {
    public static void main(String args[]) {
        Solution s = new Solution();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(s.solution(clothes));    // 5
    }
}