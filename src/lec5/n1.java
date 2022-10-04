package lec5;

import java.util.ArrayList;

public class n1 {
//    로직을 암기하고 -> 안보고 코딩을 치는 연습을 하면됨
    // 문자열의 괄호 개수는 입력값의 2배
    public int input = 3;
    public String left = "(";
    public String right= ")";
    // 마구잡이가 아닌 감싸는 괄호 형태 유지 필요 - 짝 맞추기
    public int numLeft = input;
    public int numRight = input;
    public ArrayList<String> list = new ArrayList<String>();

    public String nextString() {
        list.add(0, left);
        if(list.contains(left)){
            list.add(right);
        }
        return null;
    }


    public String pairsOfParentheses(int input) {
        int length = input * 2;


        for(int i = 0; i < length; i++){

//            list.add(i, );
        }

        return null;
    }


    public static void main(String[] args) {

    }
}


