public class Pro3_64010726 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        
        for (int i = 0; i < 20; i++) {
             queue.enqueue(i);
        }
    }

    class Queue {
        private int[] elements;
        private int size;
        private boolean empty;

        public Queue() {
            elements = new int[8];
        }

        public boolean empty(){
            return size == 0;
        }

        public int getSize(){
            return size;
        }

        public void enqueue(int v) {

        }

        public int dequeue() {

        }
    }
}
