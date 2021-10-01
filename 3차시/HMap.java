import java.util.*;

class HMap {
    public boolean solution(String[] phone_book) {

        boolean answer = true;

        Arrays.sort(phone_book, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o2.length() - o1.length();
            }
        });


        HashMap<String, Boolean> map = new HashMap<>();

        for(String str : phone_book){
            if(map.containsKey(str)){
                answer = false;
                break;
            }
            for(int i  = 1 ; i < str.length() ; i++){
                String sub = str.substring(0, i);
                if(!map.containsKey(sub)){
                    map.put(sub, true);
                }
            }
        }

        return answer;


    }
}