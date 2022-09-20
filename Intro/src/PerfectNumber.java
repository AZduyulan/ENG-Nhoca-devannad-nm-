
public class PerfectNumber {
	public static void main(String[] args) {
        int number = 13;
        int total = 0;
        for(int a=1;a<number;++a){
            if(number%a==0){
                total+=a;
            }
        }
        if(total== number){
            System.out.println(number+ " its an perfect number");
        }else{
            System.out.println(number + " yok gardaş değil işte anlasana");
        }
    }
}
