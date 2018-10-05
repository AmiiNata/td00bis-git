package fr.dauphine.ja.kaneAminata.td00;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random; 

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	ArrayList<Integer> numbers = new ArrayList<Integer>(50);
	
	public void initRandom(int n, int m) {
		Random r = new Random();
		int val;
		for(int i=0; i<n; i++) {
			val = r.nextInt(m);
			numbers.add(val);
		}
	}
	
	private boolean isPrime(int p) {
		if(p<=1) 
			return false;
		
		//dans le cas contraire 
		for(int i=2; i*i<p; i++) {
			if(p%i ==0)
				return false;
		}
		
		return true;
	}
	
	public void printPrimes() {
		for(int i=0; i<numbers.size(); i++) {
			if(isPrime(numbers.get(i))) {
				System.out.println(numbers.get(i));	
			}
		}
	}
	
	
	
    public static void main( String[] args )
    {
    	PrimeCollection p = new PrimeCollection();
    	p.initRandom(50, 1500);
    	p.printPrimes();
        
    }
}
