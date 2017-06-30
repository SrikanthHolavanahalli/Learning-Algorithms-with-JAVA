package google;

public class FileSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.out.println(printSum("dir1\n dir11\n  dir111\n   picture.gif\n   text1.txt\n  dir112\n   sample1.jpeg\n dir12\n  sample2.gif"));
		
		
		//System.out.println(printSum("dir1\n dir11\n  dir111\n   picture.gif\n"));
		
		
        String directoryListing = "dir1\n dir11\n  dir1111\n   picture.gif\n   text1.txt\n  dir112\n   sample1.jpeg\n dir12\n  sample2.gif";
		//String directoryListing = "dir1\n dir11\n  dir111\n   picture.gif\n";
	       
		System.out.println("\nThe total length of the Absolute paths containing the images is: "+getLengthOfAbsolutePathsForImages(directoryListing));

		
	}
	
	
	
	    public static int getLengthOfAbsolutePathsForImages(String directoryListing) {
	        String[] directories = directoryListing.split("\n");
	        int sumOfAbsolutePaths = 0, spacesInAbsolutePath = 0, lastForwardSlash = 0, levelDownIteration = 0;
	        int globalMaxPath =0;
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0; i < directories.length; i++){
	            String line = directories[i];
	            if (line.contains(".jpeg") || line.contains(".png") || line.contains(".gif")) {
	                sumOfAbsolutePaths = sb.length();
	                if(sumOfAbsolutePaths > globalMaxPath)
	                	globalMaxPath = sumOfAbsolutePaths;
	                System.out.println("\nImage file found!");
	                spacesInAbsolutePath = line.length() - line.trim().length();
	                System.out.println(sb.toString()+" length: "+sb.length()+" sumOfAbsolutePaths: "+sumOfAbsolutePaths);
	            }
	            else{
	                //For any other extension skip the current iteration
	                if(line.contains(".")){
	                    System.out.println(sb.toString());
	                    continue;
	                }

	                //Going into a directory
	                if(spacesInAbsolutePath < line.length() - line.trim().length()) {
	                    spacesInAbsolutePath = line.length() - line.trim().length();
	                } else if((spacesInAbsolutePath > line.length() - line.trim().length())&&(line.length() - line.trim().length() != 0)){
	                    //Coming outside a directory and not in the root directory
	                    levelDownIteration = spacesInAbsolutePath - (line.length() - line.trim().length());
	                    spacesInAbsolutePath = line.length() - line.trim().length();

	                    while(levelDownIteration!=0) {
	                        lastForwardSlash = sb.toString().lastIndexOf('/');
	                        sb.replace(lastForwardSlash, sb.length(), "");
	                        levelDownIteration--;
	                    }
	                } else if(line.length() - line.trim().length() == 0){
	                    //This handles the scenario when we are in the root directory
	                    sb.replace(0,sb.length(),"");
	                } else {
	                    //This handles the scenario when we are in the same directory level
	                    lastForwardSlash = sb.toString().lastIndexOf('/');
	                    sb.replace(lastForwardSlash,sb.length(),"");
	                }
	                sb.append("/" + line.trim());
	                System.out.println(sb.toString());
	            }
	        }
	       // return sumOfAbsolutePaths;
	        return globalMaxPath;
	    }

	
	
	
	
	
	public static int printSum(String s){
		String[] arr=s.split("\n");
		int sum=0, spaces=0;
		for(int i=arr.length-1;i>=0;i--){
			String line=arr[i];
			if(line.contains(".gif") | line.contains(".jpeg")){
				spaces=line.length()-line.trim().length();
			}
			if(spaces> line.length()-line.trim().length() ){
				sum+=line.trim().length()+1;
				spaces--;
			}
		}
		return sum;
	}
	
	
	
	
	
	
}
