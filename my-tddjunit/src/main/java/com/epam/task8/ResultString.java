package com.epam.task8;

public class ResultString {

	public String removeA(String string) {
		String result = string;
        if(string.length() <= 2 && string.contains("A") ){
            result = result.replace("A","");
        }
        else if(string.length() <= 2)
        {
            return result;
        }
        else{
            String res = string.substring(0,2);
            String res1 = string.substring(2,string.length());
            result = res.replace("A","") + res1;
        }
        return result;
	}

}
