
public class ListChechk {
	 public static void main(String[] args) {
	        int[] numbers = new int[]{10,20,30,40,50,60,70,80,90,100};
	        int number=50;
	        boolean Chechk=false;
	        for(int a=0;a<numbers.length;++a){
	            if(number==numbers[a]){
	                Chechk = true;
	            }
	        }
	        if(Chechk){
	            System.out.println("İTs in.");
	        }else{
	            System.out.println("WHAAAAAt");
	        }
	    }

}
