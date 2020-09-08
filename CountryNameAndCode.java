import java.util.*;
public class CountryNameAndCode{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input;
        Map<String,String> map_countryNameVsCode = new HashMap<String,String>();
        String[] countryNameVsCode;
        List<String> list=new ArrayList<String>();
        String country,code,countryAndCode;
        while(sc.hasNextLine()){
            country ="";
            code="";
            countryAndCode = "";
            input = sc.nextLine();
            countryNameVsCode = input.split("\\s+");
            
            for(String str : countryNameVsCode){
               if(str.matches(".*\\d.*") == true){
                   code = str.replaceAll("[\\-]", "");;
               }else{
                   country = country+" "+str;
               } 
            }
            country = country.trim();
            countryAndCode = countryAndCode+country+"(+"+code+")";
            list.add(countryAndCode);
            System.out.println(countryAndCode);
            map_countryNameVsCode.put(country,code);
        }
        for (Map.Entry<String,String> entry : map_countryNameVsCode.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                           ", Value = " + entry.getValue());
     }
}
