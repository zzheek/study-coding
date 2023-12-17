class Solution {
    public String solution(String my_string) {
        
        StringBuffer str = new StringBuffer(my_string);
        
        return str.reverse().toString();
        
    }
}




class Solution {
    public String solution(String myString) {
        return new StringBuilder(myString).reverse().toString();
    }
}
