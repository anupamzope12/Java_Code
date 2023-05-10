package Tester;

import java.util.Scanner;

import RunnableTask.AveragePrinterTask2;
import RunnableTask.EvenPrinterTask;
import RunnableTask.OddPrinterTask;

public class TestConcurrency {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the range : begin n end");
			int start=sc.nextInt();
			int end=sc.nextInt();
			//Create a task,attach a thrd to the task ,start the thrd
			//imple Runnable:Thrd (Runnable task,String nm)
			Thread t1=new Thread(new EvenPrinterTask(start, end),"Even");//t1:new
			Thread t2=new Thread(new OddPrinterTask(start, end),"Odd");//t2:new
			Thread t3=new Thread(new AveragePrinterTask2(start, end),"Average");//t3:new
			
			//start thrd
			t1.start();
			t2.start();
			t3.start();
			
			System.out.println("main waiting for child thrteads to complete exc");
			//join
			t1.join();
			t2.join();
			t3.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
