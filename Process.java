
public class Process {
	int pid; // Process ID 
	   int bt;  // Burst Time 
	   int priority; // Priority
	   int at; // arrival time
	   Process(){};
	   Process(int pid, int bt){
		 this.pid=pid;
		 this.bt=bt;
	   };
	   Process(int pid, int bt, int priority){
			 this.pid=pid;
			 this.bt=bt;
			 this.priority= priority;
		   };
		Process(int pid, int bt, int priority, int at){
				 this.pid=pid;
				 this.bt=bt;
				 this.priority= priority;
				 this.at= at;
			   };
}
