package edu.eci.arsw.primefinder;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		int a,b,range,threadNumber,firstNumber,lastNumber;
		LinkedList<PrimeFinderThread> primeFinderThreads = new LinkedList<>();

		a = 0;
		b = 30000000;
		threadNumber = 3;
		range = (b-a)/threadNumber;

		for(int i=0;i<threadNumber;i++){
			firstNumber = range*i;
			lastNumber = range*(i+1);

			primeFinderThreads.add(new PrimeFinderThread(firstNumber,lastNumber));
		}

		for(PrimeFinderThread thread:primeFinderThreads){
			thread.start();
		}
	}
	
}
