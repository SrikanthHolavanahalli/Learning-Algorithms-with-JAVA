package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));

	}
	
	
	public static  String validIPAddress(String IP) {
	     
        Boolean IPv4 = false;
        
        if(IP.indexOf('.') > -1)
            IPv4 = true;
        else if(IP.indexOf(':') > -1)
            IPv4 = false;
        else
            return "Neither";
            
        int colonCounter = 1;
        
        if(IPv4 == true)
        {
            int currIndex = 0;
            int nextIndex = IP.indexOf('.');
            String code ="";
            
            Pattern p = Pattern.compile("[0-9]+");
            Matcher m = p.matcher(IP.substring(currIndex,nextIndex));
            int dotCounter = 1;
            
            while(nextIndex > -1)
            {   
                dotCounter++;
                
                if(dotCounter > 4)
                    return "Neither";
                code = IP.substring(currIndex,nextIndex);
                m.reset(code);
                try
                {
                    Integer.parseInt(code);
                }
                catch(Exception e)
                {
                    return "Neither";
                }
                
                
                if(code.length() < 4 && m.matches() && Integer.parseInt(code) < 256 )
                {   
                    if(code.length() !=1 && code.charAt(0)== '0')
                        return "Neither";
                    
                    currIndex = nextIndex+1;
                    nextIndex = IP.indexOf('.',currIndex);
                }
                else
                return "Neither";
            }
            
            code = IP.substring(currIndex);
            m.reset(code);
            if(code.length() < 4 && dotCounter == 4 && m.matches() &&  code.length() !=0 &&  Integer.parseInt(code) < 256 && code.charAt(0)!= '0')
                return "IPv4";
            else
                return "Neither";
        }
        else
        {
            
            
            int currIndex = 0;
            int nextIndex = IP.indexOf(':');
            
            Pattern p = Pattern.compile("[0-9a-fA-F]+");
            Matcher m = p.matcher(IP.substring(currIndex,nextIndex));
            String code = "";
            while(nextIndex > -1)
            {
            	colonCounter++;
                
                if(colonCounter > 8)
                    return "Neither";
            	
                code = IP.substring(currIndex,nextIndex);
                m.reset(code);
                
                if(code.length() < 5 && code.length() !=0 &&  m.matches() )
                {    
                    currIndex = nextIndex+1;
                    nextIndex = IP.indexOf(':',currIndex);
                }
                else
                return "Neither";
            }
            
            code = IP.substring(currIndex);
            m.reset(code);
            
            if(code.length() < 5 && colonCounter== 8 && m.matches() )
                return "IPv6";
            else
                return "Neither";
        }
        //return "Neither";
    }
}
