import java.util.Comparator;

public class SJFn implements Comparator <Process> {
	
	SJFn(){};
	// This function is used for sorting all 
	// processes in increasing order of burst 
	// time 
	static boolean comparison(Process a, Process b) 
	{ 
	     return (a.bt < b.bt); 
	} 
	  
	// Function to find the waiting time for all 
	// processes 
	static void findWaitingTime(Process proc[], int n, int wt[]) 
	{ 
	    // waiting time for first process is 0 
	    wt[0] = 0; 
	  
	    // calculating waiting time 
	    for (int i = 1; i < n ; i++ ) 
	        wt[i] = proc[i-1].bt + wt[i-1] ; 
	} 
	  
	// Function to calculate turn around time 
	static void findTurnAroundTime(Process proc[], int n, 
	                        int wt[], int tat[]) 
	{ 
	    // calculating turnaround time by adding 
	    // bt[i] + wt[i] 
	    for (int i = 0; i < n ; i++) 
	        tat[i] = proc[i].bt + wt[i]; 
	} 
	  
	//Function to calculate average time 
	static void findavgTime(Process proc[], int n) 
	{ 
	    int wt[]= new int[n];
	    int tat[]= new int [n]; 
	    int total_wt = 0, total_tat = 0; 
	  
	    // Function to find waiting time of all processes 
	    findWaitingTime(proc, n, wt); 
	  
	    // Function to find turn around time for all processes 
	    findTurnAroundTime(proc, n, wt, tat); 
	  
	    // Display processes along with all details 
	    System.out.println("Processes " + " Burst time " + 
				" Waiting time " + " Turn around time"); 
	    // Calculate total waiting time and total turn 
	    // around time 
	    for (int i = 0; i < n; i++) 
	    { 
	        total_wt = total_wt + wt[i]; 
	        total_tat = total_tat + tat[i]; 
	        System.out.println(" " + (i+1) + "\t\t" + proc[i].bt +"\t " + 
					wt[i] +"\t\t " + tat[i]); 
} 

	    System.out.println("Average waiting time = " + 
				(float)total_wt / (float)n); 
	    System.out.println("Average turn around time = " + 
				(float)total_tat / (float)n); 
}
	//Function to calculate average turnaround time 
		static float findavgtTime(Process proc[], int n) 
		{ 
		    int wt[]= new int[n];
		    int tat[]= new int [n]; 
		    int total_wt = 0, total_tat = 0; 
		  
		    // Function to find waiting time of all processes 
		    findWaitingTime(proc, n, wt); 
		  
		    // Function to find turn around time for all processes 
		    findTurnAroundTime(proc, n, wt, tat); 
		  
		    // Calculate total waiting time and total turn 
		    // around time 
		    for (int i = 0; i < n; i++) 
		    { 
		        total_wt = total_wt + wt[i]; 
		        total_tat = total_tat + tat[i]; 
	} 

		    System.out.println("Average turn around time of SJF non premptive = " + 
					(float)total_tat / (float)n); 
		    return ((float)total_tat / (float)n);
	}
		//Function to calculate average waiting time 
		static float findavgwTime(Process proc[], int n) 
		{ 
		    int wt[]= new int[n];
		    int tat[]= new int [n]; 
		    int total_wt = 0, total_tat = 0; 
		  
		    // Function to find waiting time of all processes 
		    findWaitingTime(proc, n, wt); 
		  
		    // Function to find turn around time for all processes 
		    findTurnAroundTime(proc, n, wt, tat); 
		  
		    // Calculate total waiting time and total turn 
		    // around time 
		    for (int i = 0; i < n; i++) 
		    { 
		        total_wt = total_wt + wt[i]; 
		        total_tat = total_tat + tat[i]; 
	} 

		    System.out.println("Average waiting time of SJF non premptive = " + 
					(float)total_wt / (float)n); 
		    return ((float)total_wt / (float)n);
	}
	@Override
	public int compare(Process a, Process b) {
		// TODO Auto-generated method stub
		
		return a.bt - b.bt;
	}  
	} 

