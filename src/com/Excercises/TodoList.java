package com.Excercises;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> value = new ArrayList<>();


//    The add method
    public void adding(String add){
        value.add(add);
    }

//    The remove method
    public void removing(int removeValue){
        if (removeValue >= 0 && removeValue <value.size()) {
            value.remove(removeValue);
        }
    }

//    The print method
    public void printing(){
        if (value.size() > 0){

            for (int i = 0; i < value.size(); i++){
                System.out.println(i + value.get(i) + "\n\n");
            }

        }else {
            System.out.println("Your list is empty \n\n");
        }
    }

//    The modify method
    public void modifying(int number, String modifyValue){
        if (number >= 0 && number < value.size()){
            value.set(number, modifyValue);
        }
    }
}
