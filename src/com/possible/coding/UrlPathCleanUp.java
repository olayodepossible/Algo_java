package com.possible.coding;

import java.util.LinkedList;

public class UrlPathCleanUp {
    public static String shortenPath(String path) {

        LinkedList<String> stack = new LinkedList<>();
        boolean isAbsolutePath = path.startsWith("/");

        String[] splitedPaths = path.split("/");

        for(String splitPath : splitedPaths){
            if(splitPath.equals("..")){
                if(!stack.isEmpty() && !stack.peek().equals("..")){
                    stack.pop();
                }else if (!isAbsolutePath){
                    stack.push(splitPath);
                }

            }
            else if(!splitPath.isEmpty() && !splitPath.equals(".")){
                stack.push(splitPath);
            }

        }
        StringBuilder sPath = new StringBuilder();
        while(!stack.isEmpty()){
            sPath.insert(0, "/" + stack.pop());
        }
        // if path is empty return "/" for absolute path
        if (isAbsolutePath){
            return sPath.length() > 0 ? sPath.toString() : "/";
        }
        else{
            // if path is empty return "." for relative path
            return sPath.length() > 0 ? sPath.toString().substring(1) : ".";
        }
    }

}
