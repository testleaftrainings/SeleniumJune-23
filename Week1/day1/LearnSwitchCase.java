package week1.day1;

public class LearnSwitchCase {
	
	public static void main(String[] args) {
		
		String browserType = "Edge";
		
        switch(browserType) {
        case "Edge":
        	System.out.println("Open Edge browser");
        	break;
        case "Chrome":
        	System.out.println("Open Chrome browser");
        	break;
        case "FireFox":
        	System.out.println("Open FireFox browser");
        	break;
        default:
        	System.out.println("Open default browser");
        	break;
        
        }
		
		
	}

}
