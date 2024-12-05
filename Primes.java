



public class Primes {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        int i = 2;
        int count = 0;
        System.out.println("Prime numbers up to "+ max +":");
        while (i <= max){
            Boolean prime = false;
            for(int j = 2; j <= i;){
                if((i % j) > 0){
                    j++;
                }
                if((i % j) == 0){
                    if(i == j){
                        prime =true;
                        count++;
                        j= max+1;
                    }else{
                        j = max+1;
                    }  
                }
             }
            if(prime == true){
                System.out.println(i);
                i++;
            }else{
                i++;
        } 
    }
    int precents = ((count*100)/max);
    System.out.println("There are "+ count+ " primes between 2 and "+max+" ("+ precents+"% are primes)"); 
    
    }
        
}