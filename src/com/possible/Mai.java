package com.possible;

public class Mai {


        public static class TextInput {
            public static void add(char c){
                System.out.println(getValue()+ c);
            }

            public static String getValue(){
                return new String();
            }
        }

    public static class NumericInput extends TextInput {
        public static void add(char c){

            Boolean isDigit = Character.isDigit(c);
            if(isDigit){
                StringBuilder desc = new StringBuilder();
                desc=desc.append(c);
                System.out.println(desc.toString());
            }

        }

    }

        public static void main(String[] args) {
            TextInput input = new NumericInput();
            input.add('1');
            input.add('a');
            input.add('0');
            System.out.println(input.getValue());
        }

}
