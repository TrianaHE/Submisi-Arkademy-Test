
public class Segitiga {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		int kolom = 10;
 	  	for( c=1;c<=kolom;c++){
 	  		for(d=1;d<=1;d++){
 	  			if(c%2==0)
 	  				System.out.print(" ");
 	  			else
 	  				System.out.print("*");
 	  			if(c==kolom)
 	  				System.out.println("*");
 	  		}
 	  	}

 	  	for(a=1;a<=5;a++){
			for(b=1;b<=a;b++){
				System.out.print(" ");
			}
			for(b=1;b<2;b++){
	   			System.out.print("*");
			}
			for(b=3;b>=a;b--){
	        	System.out.print(" ");
	       	}
	 	  	for(b=3;b>=a-1;b--){
	 	    	System.out.print(" ");
	 	 	}
	    	for(b=1;b<2;b++){
		   		if(a<5){
			   		System.out.print("*");
		   		}else{
	 		   		System.out.print(" ");
			  	}
	    	}
	 	   	System.out.println();
       	}
	}
}
