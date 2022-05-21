package UNIT_03;

/*
 * Multiprocessing :-
 *                 - parallel processing
 *                 -Sequential processing
 *                 -concurrent processing
 *                 
 * Multitasking :-
 *             -Parallel multitasking
 *             -Sequential multitasking
 *             -Concurrent multitasking
 *                 
 * Program counter :- holds the address of the next instruction to be executed 
 *                 by 1 processing unit.
 *                 
 *                 
 * MultiThreading Task :- 
 *                 *It is users job to find out the independent task of that process.
 *                 *Your findings are T1,T2,T3,T4 Task of process T1 out of 8 total task.
 *                 *Context switching between these task and the worst time 
 *                  is not decided by the user instead JVM will decide this.
 *                 *MultiThreading is applied when concurrent multitasking occurs.
 *                 *It is users job to put these independent codes into their 
 *                  respective threads.
 *                 *User have to start these threads by T1.start,T2.start,T3.start,T4.start.
 *     
 *                 
 */
public class P16_MultiThreading {

	public static void main(String[] args) {
	MultiThreading obj=new MultiThreading();
	obj.threadConcept();
	obj.threadSynchronization();
	obj.interThreadCommunication();
	obj.ProducerConsumerProblems();
	obj.Wait_And_Notify();

	}

}
class MultiThreading
{
	void threadConcept()
	{
		
	}
	void threadSynchronization()
	{
		
	}
	void interThreadCommunication()
	{
		
	}
	void ProducerConsumerProblems()
	{
		
	}
	void Wait_And_Notify()
	{
		
	}

	
	
}