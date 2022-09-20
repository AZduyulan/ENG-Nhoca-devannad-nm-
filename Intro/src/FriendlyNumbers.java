
public class FriendlyNumbers {
	
		public static void main(String[] args) {
			int number1=142;
	        int number2=125;
	        int plus1=0;
	        int plus2=0;

	        for(int i=1;i<number1;++i){
	            if(number1%i==0){
	            	plus1+=i;
	            }
	        }
	        for(int i=1;i<number2;++i){
	            if(number2%i==0){
	            	plus2+=i;
	            }
	        }
	        if(plus1==number2 && plus2 == number1){
	            System.out.println("They Are friends");
	        }else{
	            System.out.println("They aren't.");
	        }
			
		}
	
}
