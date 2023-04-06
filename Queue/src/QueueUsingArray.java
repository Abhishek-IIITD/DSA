import java.util.*;;


public class QueueUsingArray {
	static class Queue{
		int size,f,r, arr[];
		Queue(int s){
			size = s;
			f = r = -1;
			arr = new int[s];
		}
	}
	static boolean isFull(Queue q) {
		return (q.r == q.size - 1)?true:false;
	}

	static boolean isEmpty(Queue q) {
		return (q.f == q.r)?true:false;
	}

	static void enqueue(Queue q, int val){
		if(isFull(q)){
			System.out.println("Queue is full");
		}else{
			q.r++;
			q.arr[q.r] = val;
		}
	}
	static int dequeue(Queue q){
		int val = -1;
		if(isEmpty(q)){
			System.out.println("Queue is empty");
		}else{
			q.f++;
			val = q.arr[q.f];
		}
		return val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Queue q = new Queue(4);
		enqueue(q, 5);
		enqueue(q, 6);
		enqueue(q, 7);
		enqueue(q, 8);
		int val1 = dequeue(q);
		int val2 = dequeue(q);		
		System.out.println(""+val2);
*/
	}

}
