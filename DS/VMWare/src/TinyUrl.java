import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TinyUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	   HashMap<String, List<String>> longToTiny;
	    HashMap<String, String> TinyToLong;
	    
	    
	    
	    public void generateUniqueTinyUrl(int UserId, String longMessage){
	    	if(longToTiny.get(longMessage)==null){
	    		 longToTiny.put(longMessage, new LinkedList());
	    		 
	    	}
	    }
	    public void generate(String longMessage){
	    	String input = "";
	    	if(longMessage.length() > 6)
	    		input = longMessage.substring(0, 6);
	    	else 
	    		input = longMessage;
	    	
	    	String output ="";
	    	while( output.length() > 0)
	    		output = generateUniqueUrl(input,"");
	    	
	    	if(longToTiny.get(longMessage)== null){
	    		longToTiny.get(longMessage).add(output);
	    	}else{
	    		Iterator i = longToTiny.get(longMessage).listIterator();
	    		//Node curr = longToTiny.get(longMessage)
	    		while(i.hasNext()){
	    			curr = curr.next;
	    		}
	    		curr.next = new Node(output);
	    		TinyToLong.put(output, longMessage);
	    	}
	    	
	    	
    			
	    	
	    }
	    
	    public String generateUniqueUrl(String input, String result){
	    	
	    	for(int i = 0 ; i < result.length(); i++){
	    		result += input.charAt(Random(i)%6);
	    	}
	    	
	    	
	    	
	    	if(TinyToLong.get(result)==null)
	    		return result;
	    	else return "";
	    }
	    
	    



		
	

}

