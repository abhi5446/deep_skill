package com.cognizant.spring_learn;

public class Country {
    private String code,name;

    public String getCode(){
        return code;
    }
    public void setCode(String c){
        code=c;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    @Override
    public String toString(){
        return "Country[code="+code+",name="+name+"]";
    }
}
