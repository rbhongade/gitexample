package rr;


public class printlogic {
	
	public void  printperamid(int R)
	{
		int cnt = 1;

		for(int i = 1; i <= R; i++) {

		    for(int j = 1; j <= i; j++) {
		        System.out.print(cnt + " ");
		        ++cnt;
		    }

		    System.out.println();
		 
		}
		
	}

}


