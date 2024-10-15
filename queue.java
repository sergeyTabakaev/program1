class queue {
	private char[] q;
	private int getloc, putloc; //pointers for elements of a queue
	
	queue (int size){
		q = new char[size];
		putloc = getloc = 0;
	}
	//Method for putting an element in a queue
	void put(char ch){
		if (putloc == q.length){
			System.out.println("Queue overflow. Can't put an element");
			return;
		}
		q[putloc++] = ch;
	}
	//Method for getting an element from queue
	char get(){
		if(getloc == putloc){
			System.out.println("Empty queue. Can't get an element");
			return ((char) 0) ;
		}
		return q[getloc++];
	}
}
class QueueMain {
	public static void main (String[] args){
		queue big = new queue(100);
		queue small = new queue(4);
		char ch;
		int i;
		
		System.out.println("\nUsing 'big' for saving symbols");
		for(i = 0; i < 26; i++){
			big.put((char)('A' + i));
		}
		System.out.println("\nContainments of 'big': ");
		for(i = 0; i < 26; i++){
                        ch = big.get();
			if (ch != ((char) 0)){
				System.out.print(ch + " ");
			}else{
				break;
			}
                }
		System.out.println("\nUsing 'small' and trying to overflow: ");
		for(i = 0; i < 5; i++){
			System.out.print("Try #" + i + " ");
                        small.put((char)('A' + i));
                }
		System.out.println("\nContainments of 'small'");
		for(i = 0;; i++){
                        ch = small.get();
                        if (ch != ((char) 0)){
                                System.out.print(ch + " ");
                        }else{
                                break;
                        }
                }
	}
}
