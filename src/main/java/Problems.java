import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problems {

    static public int multipleOf3And5Until1000(){
        List<Integer> numbers = new ArrayList<>();

        for(int i=1;i<1000;i++){
            if(i%3==0 || i%5==0)
                numbers.add(i);
        }
        int total = 0;
        for(int numbero: numbers){
            total += numbero;
        }
        return total;
    }

    static public int fibonacciSequence(){
        int fibonacci = 1, som=1,count=0,somAnt=1;
        List<Integer> fibonacciPares = new ArrayList<>();

        while(true){
            if(fibonacci>=4000000)
                break;
            fibonacci=som+somAnt;
            somAnt = som;
            som = fibonacci;
            if(fibonacci%2==0)
                fibonacciPares.add(fibonacci);
        }
        for(int f: fibonacciPares){
            count+= f;
        }
        return count;
    }

    static public Integer largestPrimeNumber(){
        List<Integer> numerosPrimos = getNumbersPrime();
        long number = 600851475143L;
        int count=1;
        int primeDivisor = numerosPrimos.get(count);
        Stack<Integer> stack = new Stack<>();
        while(number>1){
            if((number%primeDivisor)!=0){
                count++;
                primeDivisor = numerosPrimos.get(count);
            }
            else{
                stack.push(primeDivisor);
                number = number/primeDivisor;
            }
        }

        return stack.pop();
    }

    static public  List<Integer> getNumbersPrime(){

        int  numero = 3;
        List<Integer> numerosPrimos = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();
        numerosPrimos.add(1);
        numerosPrimos.add(2);
        while(numero<100000){
            numeros.add(numero);
            Boolean isPrime = true;

            for(int i=0;i<numeros.size()-1;i++){
                if(numero%numeros.get(i)==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
               numerosPrimos.add(numero);
            numero++;
        }
        return numerosPrimos;
    }

    public static Long largestPalindrome() {

        Long numberA = 900L;
        Long numberB = 999L;
        Long palindrome = 0L;
        Boolean stop = false;
        for(int i = 0;i < 100;i++){
            if(stop)
                break;
            for(int j=100;j>i;j--){
                palindrome = (numberA+j)*(numberB-i);
                Long reversePalindrome = reverse(palindrome);
                if(reversePalindrome.equals(palindrome)){
                    stop = true;
                    break;
                }
            }
        }
        return palindrome;
    }

    public static Long reverse(Long number){
        long reverse = 0;
        while(number!=0){
            long remainder = number % 10;
            reverse = reverse*10+remainder;
            number = number/10;
        }
        return reverse;
    }

}
