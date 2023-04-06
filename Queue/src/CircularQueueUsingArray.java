
public class CircularQueueUsingArray {
	static class CircularQueue{
		int size, f, r, arr[];
		CircularQueue(int s){
			size = s;
			f=r=0;
			arr = new int[size];
		}
	}
	static boolean isEmpty(CircularQueue q){
		return (q.r == q.f)?true:false;
	}
	static boolean isFull(CircularQueue q){
		return ((q.r + 1)% q.size == q.f)?true:false;
	}
	static void enqueue(CircularQueue q, int val){
		if(isFull(q)){
			System.out.println("Queue is full");
		}else{
			q.r = (q.r + 1) % q.size;
			q.arr[q.r] = val;
		}
	}
	static int dequeue(CircularQueue q){
		int val = -1;
		if(isEmpty(q)){
			System.out.println("Queue is empty");
		}else{
			q.f = (q.f + 1) % q.size;
			val = q.arr[q.f];
		}
		return val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue q = new CircularQueue(4);
		enqueue(q, 3);
		enqueue(q, 4);
		enqueue(q, 5);
		int a = dequeue(q);		
		int b = dequeue(q);		
		int c = dequeue(q);		
		enqueue(q, 7);

	}

}
