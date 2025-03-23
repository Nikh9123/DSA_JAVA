// package String;

class RemoveParanthesis {
    public String removeOuterParentheses(String s) {
        int openBracket = 0 ;
        int closeBracket = 0 ;
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                openBracket++;
            }else{
                closeBracket++;
            }
            temp.append(s.charAt(i));
            if(openBracket == closeBracket){
                result.append(temp.substring(1,temp.length()-1));
                temp = new StringBuilder();
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        RemoveParanthesis removeParanthesis = new RemoveParanthesis();
        System.out.println(removeParanthesis.removeOuterParentheses("(()())(())"));
    }
}
