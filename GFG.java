import java.util.Scanner;
import java.util.Arrays;
// Java program for implementation of RR scheduling 

public class GFG 
{ 
	
	public static void main(String[] args) 
	{ 
		// process id's
		System.out.println("Welcome to CPU Scheduling Program");
		System.out.println("1. First come first Served (FCFS)");
		System.out.println("2. Round Robin (RR)");
		System.out.println("3. Shortest Job First Non-Premptive (SJF)");
		System.out.println("4. Shortest Job First Premptive (SJF)");
		System.out.println("5. Priority Non-Premptive");
		System.out.println("6. Best Algorithm possible");
		System.out.println("Choose from 1 - 6");
		Scanner sc = new Scanner(System.in);
		int choice= sc.nextInt();
		
		

		System.out.println("Enter Number of processes: ");
		int n = sc.nextInt();
		switch(choice) {
		
		case 1:{
			int burst_time[]=new int[n];
			int processes[] = new int[n];
			for (int i=0; i<n; i++ ) {
				System.out.println("Enter "+ (i+1) + " Burst time: ");
				int bt=sc.nextInt();
				burst_time[i]=bt;
			}
	        FCFS.findavgTime(processes, n, burst_time); 
	  
	    } break;
			
		
		
		case 2:{	
		
		int quantum;
		int burst_time[]=new int[n];
		int processes[] = new int[n];
		for (int i=0; i<n; i++ ) {
			System.out.println("Enter "+ (i+1) + " Burst time: ");
			int bt=sc.nextInt();
			burst_time[i]=bt;
			processes[i]=i+1;
		}
	
		// Burst time of all processes 
		 
		System.out.println("Enter Time Quantum: ");
		quantum= sc.nextInt();
		// Time quantum 
		 
		RR.findavgTime(processes, n, burst_time, quantum); 
			} break;
		case 3:{
			Process proc[] = new Process[n];
					//{{1, 6}, {2, 8}, {3, 7}, {4, 3}}; 
		    for( int i=0; i<n;i++) {
		    	System.out.println("Enter "+ (i+1) +" Burst Time");
		    	int x=sc.nextInt();
		    	proc[i]=new Process((i+1),x);
		    }
		  
		    // Sorting processes by burst time. 
		    Arrays.sort(proc, new SJFn()); 
		  
		    System.out.println("Order in which process gets executed"); 
		    for (int i = 0 ; i < n; i++) 
		        System.out.println(proc[i].pid + " \t "); 
		  
		    SJFn.findavgTime(proc, n); 
			
		}break;
		case 4:{
			
			Process proc[] = new Process[n];
					//{{1, 6}, {2, 8}, {3, 7}, {4, 3}}; 
		    for( int i=0; i<n;i++) {
		    	System.out.println("Enter "+ (i+1) +" Burst Time");
		    	int x=sc.nextInt();
		    	System.out.println("Enter "+ (i+1) +" Arrival Time");
		    	int y=sc.nextInt();
		    	proc[i]=new Process((i+1),x,0,y);
		    } 
		    SJF.findavgTime(proc, n); 
			
			
		}
		
		break;
		
		case 5:{
			
			
				Process proc[] = new Process[n];
						//{{1, 6}, {2, 8}, {3, 7}, {4, 3}}; 
			    for( int i=0; i<n;i++) {
			    	System.out.println("Enter "+ (i+1) +" Burst Time");
			    	int x=sc.nextInt();
			    	System.out.println("Enter "+ (i+1) +" Priority");
			    	int y=sc.nextInt();
			    	proc[i]=new Process((i+1),x,y);
			    }
			
			   //{{1, 10, 2}, {2, 5, 0}, {3, 8, 1}}; 
			    Priorityn.priorityScheduling(proc, n); 
			     
		}break;
		case 6:{
			float a, b, c , d, e,pp;
			int quantum;
			Process sjfn[] = new Process[n];
			Process sjf[] = new Process[n];
			Process priority[] = new Process[n];
			int burst_time[]=new int[n];
			int processes[] = new int[n];
			for (int i=0; i<n; i++ ) {
				System.out.println("Enter "+ (i+1) + " Burst time: ");
				int bt=sc.nextInt();
				burst_time[i]=bt;
				processes[i]=i+1;
				sjfn[i]=new Process((i+1),bt);
				System.out.println("Enter "+ (i+1) +" Arrival Time");
		    	int y=sc.nextInt();
		    	sjf[i]=new Process((i+1),bt,0,y);
		    	System.out.println("Enter "+ (i+1) +" Priority");
		    	int z=sc.nextInt();
		    	priority[i]=new Process((i+1),bt,z);
			}
			Arrays.sort(sjfn, new SJFn()); 
			System.out.println("Enter Time Quantum: ");
			quantum= sc.nextInt();
			a=RR.minfindavgtTime(processes, n, burst_time, quantum);
			b=SJFn.findavgtTime(sjfn, n);
			c=SJF.findavgtTime(sjf, n);
			d=Priorityn.findavgtTime(priority, n);
			e=FCFS.findavgtTime(processes, n, burst_time);
			pp=Math.min(a, Math.min(b, Math.min(c, d)));
			
			if(pp==a) {
				System.out.println("Round Robin is best Algorithm in terms of Turnaround time");
			}
			else if( pp==b) {
				System.out.println("SJF non premptive is best Algorithm in terms of Turnaround time");
			}
			else if( pp==c) {
				System.out.println("SJF premptive is best Algorithm in terms of Turnaround time");
			}
			else if(pp==d) { System.out.println("Priority non premptive is best Algorithm in terms of Turnaround time");
			}
				else System.out.println("First come first served is the best Alorithm in terms of Turnaround time");
			
			a=RR.minfindavgwTime(processes, n, burst_time, quantum);
			b=SJFn.findavgwTime(sjfn, n);
			c=SJF.findavgwTime(sjf, n);
			d=Priorityn.findavgwTime(priority, n);
			e=FCFS.findavgwTime(processes, n, burst_time);
			pp=Math.min(a, Math.min(b, Math.min(c, d)));
			if(pp==a) {
				System.out.println("Round Robin is best Algorithm in terms of Waiting time");
			}
			else if( pp==b) {
				System.out.println("SJF non premptive is best Algorithm in terms of Waiting time");
			}
			else if( pp==c) {
				System.out.println("SJF premptive is best Algorithm in terms of Waiting time");
			}
			else if(pp==d) { System.out.println("Priority non premptive is best Algorithm in terms of Waiting time");
		}
			else System.out.println("First come first served is the best Alorithm in terms of Waiting time");
		
		} break;
	}
	}}
