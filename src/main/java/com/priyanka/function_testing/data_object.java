package com.priyanka.function_testing;
import java.util.*;
import java.text.DecimalFormat;
import java.math.*;


public class data_object implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String field1;
	private java.lang.String field2;

	private String out_string;

	private java.util.List<java.lang.String> list_str = new ArrayList<java.lang.String>(); ;

	private java.lang.String output_any_contains;

	public data_object() {
	}

	public java.lang.String getField1() {
		return this.field1;
	}

	public void setField1(java.lang.String field1) {
		this.field1 = field1;
	}

	public java.lang.String getField2() {
		return this.field2;
	}

	public void setField2(java.lang.String field2) {
		this.field2 = field2;
	}

	public java.lang.String getOut_string() {
		return this.out_string;
	}

	public void setOut_string(java.lang.String out_string) {
		this.out_string = out_string;
	}

	public java.util.List<java.lang.String> getList_str() {
		return this.list_str;
	}

	public void setList_str(java.util.List<java.lang.String> list_str) {
		this.list_str = list_str;
	}

	public java.lang.String getOutput_any_contains() {
		return this.output_any_contains;
	}

	public void setOutput_any_contains(java.lang.String output_any_contains) {
		this.output_any_contains = output_any_contains;
	}


	public String stringFilter(String str, String filter_str) {
		String outputStr = "";
		if (str != null && filter_str != null) {
			char[] strToFilter = str.toCharArray();

			for (char ch : strToFilter) {
				if ((filter_str.indexOf(ch)) != -1) {
					outputStr = outputStr + String.valueOf(ch);
				}
			}
		}
		return outputStr;
	}

   public Number decimalRound(java.lang.Number num, int num_places){
        try{
            if(num_places<0) 
             num_places = 0 ;
   
            String format = (num_places == 0)? "#" :"#.";
            for(int i =1;i<=num_places;i++){
                format = format.concat("#");
            }
        DecimalFormat df = new DecimalFormat(format);
        df.setRoundingMode(RoundingMode.HALF_UP);
        return Double.parseDouble(df.format(num));
        
        } catch(Exception e) {
            return num;
        }
    }
    
public boolean isBlank(String str)
    { 
        return str.isEmpty();
    }
    
   public String stringSubstring(String str,int start_index,int length)
    {
 int startIndex = start_index < 0 ? 0 : start_index-1;
 int substringLength = length < 0 ? 0 : length;
 if( str == null || str.isEmpty() ) return str;
 if(startIndex > str.length()) return "";
 if(startIndex+substringLength > str.length()) return str.substring(startIndex);
 else return str.substring(startIndex, startIndex + substringLength); 
 }
 
  public String stringConcat(String... args) {
  String str_concat = "";
  for (String i : args) {
      if(i != null)
          str_concat = str_concat + i;
  }
  return str_concat;
 }
   
 public ArrayList<String> convertVectorToString(java.util.List inputList){
 ArrayList<String> strList = new ArrayList<String>();
 
 if(inputList.size() != 0){
  String combineVectorStr = "";
 
  for(Object str : inputList){
   combineVectorStr = combineVectorStr + str + "~";
  }
  strList.add(combineVectorStr);
  return strList;
 }
 return strList;
}

public boolean isNull(Object obj){
	   return obj == null ;
   }
   
public int getLengthOf(Object obj){
  if(obj instanceof String) return ((String)obj).length();
  return -1;
}
}