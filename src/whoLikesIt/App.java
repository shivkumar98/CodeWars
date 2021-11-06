package whoLikesIt;

public class App {
private static String whoLikesIt() {
		
		return "no one likes it";
	}

	   public static String whoLikesIt(String[] names) {
	        StringBuffer stringBuffer = new StringBuffer();
	     
	        if (names.length == 1) {
	        	stringBuffer.append(names[0]+ " ");
	        }
	        
	      
	        
	        if (names.length == 2) {
	        	stringBuffer.append(names[0] + " and "+names[1] + " ");
	        }
	        
	        if (names.length == 3) {
	        	stringBuffer.append(names[0]+", "+ names[1]+" and "+names[2]+" ");
	        }
	        
	        if (names.length > 3) {
	        	stringBuffer.append(names[0]+ " and "+names[1]+" and "
	        			+Integer.toString(names.length-2)
	        			+ " others ");
	        	
	        }
	        
	        if (names.length==1) {
	        	stringBuffer.append("likes it");
	        } else {
	        	stringBuffer.append("like it");
	        }
	        
	        
	        
	        
	        return stringBuffer.toString();
	   }

	public static void main(String[] args) {
	
		System.out.println(whoLikesIt(new String[]{"shiv"}));

	}

	
}
