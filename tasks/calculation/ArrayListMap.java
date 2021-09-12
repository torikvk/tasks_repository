package org.training.tasks.calculation;

import java.util.*;

public class ArrayListMap {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>(Arrays.asList("Ivan Ivanov","Petr Petrov Petrovich","Semen Semionov"));
        String spl = " ";
        List<String> subPeople;
        for(String obj:people){
            subPeople = Arrays.asList(obj.split(spl));
            if(subPeople.size()==2)
                System.out.println(obj);
        }

        String word = "Ancwkdssdxlsjx";
        Map<Character,Integer> charCount = new HashMap<Character,Integer>();
        for(int i=0;i<word.length();i++){
            char symb = word.charAt(i);
            Integer count = charCount.get(symb);
            if(count==null)
                count = 0;
            charCount.put(symb,count+1);
        }
        Set<Character> charInWord = charCount.keySet();
        for(Character obj:charInWord){
            System.out.println(obj+":"+charCount.get(obj));
        }
    }
}
