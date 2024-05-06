package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		System.out.println(q.peek());
//		System.out.println(q.element());

		for (int i = 20; i <= 30; i++) {
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll()); // xoa phan tu dau tien cua hang doi va tra ve gia tri da xoa
		System.out.println(q.remove()); // remove phan tu dau tien cua hang doi va tra ve gia tri phan tu tiep theo
		System.out.println(q); // queue se ko duy tri thu tu ke tu sau khi ta them hoac xoa phan tu trong queue
	}

}
