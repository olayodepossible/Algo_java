package com.possible;

public class Mai {


        public interface TextInput {
            public static void add(char c){
                System.out.println(getValue()+ c);
            }

            public static String getValue(){
                return "Yes ";
            }
        }

    public static class NumericInput implements TextInput {
        public static void add(char c){
            StringBuilder desc = new StringBuilder();
            Boolean isDigit = Character.isDigit(c);
            if(isDigit) desc = desc.append(c);
            System.out.println(desc.toString());
        }

    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        NumericInput.add('1');
        NumericInput.add('a');
        NumericInput.add('0');
        System.out.println(TextInput.getValue());
    }

}
