

public class Primes {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        int i = 2;
        int count = 0;
        System.out.println("Prine numbers up to "+ max +":");
        while (i < max){
            Boolean prime = false;
            for(int j =2; j < max;){
                int test = i%j;
                if(test != 0){
                    prime = false;
                    j++;
                }
                if(test == 0 && i != j){
                    prime = false;
                    i++; 
                }
                if(test == 0 && i == j){
                    prime = true;
                    count++;
                    System.out.println(i);
                    i++;
                }
            }
            int precents = (count/max)*100;
            System.out.println("There are "+ count+ " primes between 2 and "+max+" ("+ precents+"% are primes"); 
        }
        }
    }
        
