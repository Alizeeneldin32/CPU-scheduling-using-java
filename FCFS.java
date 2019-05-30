
public class FCFS {
	// Function to find the waiting time for all  
    // processes  
    static void findWaitingTime(int processes[], int n, 
            int bt[], int wt[]) { 
        // waiting time for first process is 0  
        wt[0] = 0; 
  
        // calculating waiting time  
        for (int i = 1; i < n; i++) { 
            wt[i] = bt[i - 1] + wt[i - 1]; 
        } 
    } 
  
    // Function to calculate turn around time  
    static void findTurnAroundTime(int processes[], int n, 
            int bt[], int wt[], int tat[]) { 
        // calculating turnaround time by adding  
        // bt[i] + wt[i]  
        for (int i = 0; i < n; i++) { 
            tat[i] = bt[i] + wt[i]; 
        } 
    } 
  
    //Function to calculate average time  
    static void findavgTime(int processes[], int n, int bt[]) { 
        int wt[] = new int[n], tat[] = new int[n]; 
        int total_wt = 0, total_tat = 0; 
  
        //Function to find waiting time of all processes  
        findWaitingTime(processes, n, bt, wt); 
  
        //Function to find turn around time for all processes  
        findTurnAroundTime(processes, n, bt, wt, tat); 
  
        //Display processes along with all details  
        System.out.printf("Processes Burst time Waiting"
                       +" time Turn around time\n"); 
  
        // Calculate total waiting time and total turn  
        // around time  
        for (int i=0; i<n; i++) 
		{ 
			total_wt = total_wt + wt[i]; 
			total_tat = total_tat + tat[i]; 
			System.out.println(" " + (i+1) + "\t\t" + bt[i] +"\t " + 
							wt[i] +"\t\t " + tat[i]); 
		} 
        System.out.println("Average waiting time = " + 
				(float)total_wt / (float)n); 
        System.out.println("Average turn around time = " + 
				(float)total_tat / (float)n); 
} 
    static float findavgtTime(int processes[], int n, int bt[]) { 
        int wt[] = new int[n], tat[] = new int[n]; 
        int total_tat = 0; 
  
        //Function to find turn around time for all processes  
        findTurnAroundTime(processes, n, bt, wt, tat); 
  
  
        // Calculate total waiting time and total turn  
        // around time  
        for (int i=0; i<n; i++) 
		{ 
			total_tat = total_tat + tat[i]; 
		}
        System.out.println("Average turn around time for FCFS = " + 
				(float)total_tat / (float)n); 
        return ((float)total_tat / (float)n);
    }
			  static float findavgwTime(int processes[], int n, int bt[]) { 
			        int wt[] = new int[n];
			        int total_wt = 0;
			  
			        //Function to find waiting time of all processes  
			        findWaitingTime(processes, n, bt, wt); 
			  
			        // Calculate total waiting time and total turn  
			        // around time  
			        for (int i=0; i<n; i++) 
					{ 
						total_wt = total_wt + wt[i]; 
					
					}
			        System.out.println("Average waiting time for FCFS = " + 
							(float)total_wt / (float)n); 
			        return ((float)total_wt / (float)n);
			  }
    
    } 
