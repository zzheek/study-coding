class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String str = s.toLowerCase();
        int p = 0;
        int y = 0;
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'p') {
                p++;
            } else if(ch == 'y') {
                y++;
            }
        }
        answer = p == y ? true : false;
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}




class Solution {
    boolean solution(String s) {

        return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;
    }
}




class Solution {
    boolean solution(String s) {
        int size = s.length(), pCount = 0, yCount = 0;
        for(int i=0; i<size; i++){
            switch(String.valueOf(s.charAt(i)).toUpperCase()){
                case "P": pCount++; break;
                case "Y": yCount++; break;
                default: break;
            }
        }
        if(pCount==0 && yCount==0) return true;
        return (pCount==yCount)?true:false;
    }
}
