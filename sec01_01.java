import java.util.Scanner;
public class main
{
    public int solution(String str, char cha) {
        int ans = 0;
		//1. toUpperCase
        str = str.toUpperCase();
        cha = Character.toUpperCase(cha);
	
		//2. toLowerCase 
		/*str = str.toLowerCase();
        cha = Character.toLowerCase(cha);*/ 
		
		for(int i = 0; i<str.length(); i++) {
			//str -> index access
			if(str.charAt(i) == cha) ans ++; 
		}

        return ans; 
    }

    public static void main(String[] args)
    {
		main T = new main();
        //input
        Scanner scan = new Scanner(System.in); 

        String str = scan.next();
        char cha = scan.next().charAt(0);
        
        System.out.println(T.solution(str, cha));
       // return;
        
    }
}