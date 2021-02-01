package edu.eci.arsw.primefinder;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String in;
		Scanner scanner;
		Date startDate, endDate;
		int a, b, range, threadNumber, firstNumber, lastNumber, seconds = 0;
		LinkedList<PrimeFinderThread> primeFinderThreads = new LinkedList<>();

		a = 0;
		b = 30000000;
		threadNumber = 3;
		startDate = new Date();
		range = (b-a)/threadNumber;

		for(int i=0;i<threadNumber;i++){
			firstNumber = range*i;
			lastNumber = range*(i+1);

			primeFinderThreads.add(new PrimeFinderThread(firstNumber,lastNumber));
		}

		for(PrimeFinderThread thread:primeFinderThreads){
			thread.start();
		}

		while(seconds!=5) {
			endDate = new Date();
			seconds = (int)((endDate.getTime()-startDate.getTime())/1000);
		}

		for(PrimeFinderThread thread:primeFinderThreads) {
			thread.setSuspend(true);
		}

		System.out.println("Press Enter to Continue...");

		scanner = new Scanner(System.in);
		in = scanner.nextLine();

		if(in.equals("")) {
			for(PrimeFinderThread thread:primeFinderThreads) {
				thread.resumeThread();
			}
		}
	}
}

