import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < participant.length; i++) {
            if(map.containsKey(participant[i])){
                int count = map.get(participant[i]);
                map.put(participant[i], count+1);
            }else {
                map.put(participant[i], 1);
            }
        }
        
        for(int i = 0; i < completion.length; i++){
            if(map.containsKey(completion[i])){
                int count = map.get(completion[i]);
                map.put(completion[i], count-1);
            }
        }
        
        for(String key:map.keySet()){
            if(map.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}