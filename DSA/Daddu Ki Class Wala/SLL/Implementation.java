public class Implementation{

    private static class Node {
        private int data ; 
        private Node next ;
        
    }

    private Node head;
    private Node tail;
    private int  size;

    //0(n)
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
        }   

        
        public int count() {
            return size;
            }


        //0(1)    
        public void InsertAtFirst(int value){
            //pahale agar linked list  khaali hai  (head mein null ; next mein null aur data 0 )
            Node newNode = new Node(); //node banayi 
            newNode.data = value;
            if(size == 0){
                head = newNode;
                tail = newNode;
                size++;
            }
            else{
                newNode.next = head;
                head = newNode;
                size++;
            }
        }     


        //0(1)
        public void InsertAtLast(int value){
                if (size == 0) {
                    InsertAtFirst(value);
                }
                else{
                    Node newNode = new Node(); //node banayi 
                    newNode.data = value;
                    tail.next = newNode;
                    tail = newNode;
                    size++;
                }
            }


        //0(1)
        public void InsertAtParticularIndex(int value , int index){
                if (index == 0) {
                    InsertAtFirst(value);
                }
                else if(index==size) {
                    InsertAtLast(value);
                }
                else{
                    Node newNode = new Node(); //node banayi 
                    newNode.data = value;
                    // insert in between krne pe changes prev aur jo add kiya hai node usme aayenge 
                    Node indexMinus1 = GetNode(index-1);
                    newNode.next = indexMinus1.next;
                    indexMinus1.next=newNode;
                      size++;
                }
            }

            //0(1)
            // index given hoga mujhe uss index pr jo node hi uska address batana hai 
            public Node GetNode(int index){
                if(index<0 || index>=size){
                    System.out.println("Chal htt out of bound hai");
                }
                Node temp = head; 
                for (int i = 0; i <index; i++) {
                    temp=temp.next;
                }
                return temp;
            }


            //0(1)
            public int getFirst(){
                return head.data;
            }
            public int getLast(){
                return tail.data;
            }
            public int getIndex(int idx){
                return GetNode(idx).data;
            }
               
            //0(1)
            public int removeFirst(){
                int removeNode = head.data;
                if(size==1){
                    head=null;
                    tail=null;
                }
                else{
                    Node temp =head;
                    head=head.next;
                    temp.next=null ; 
                }
                size--;
                return removeNode;
            }

            //0(n)
            public int removeLast(){
                if(size==1){
                    return removeFirst();
                }
                else{
                    int removeNode = tail.data;
                    Node secondLastNode =GetNode(size-2);
                    secondLastNode.next=null;
                    tail=secondLastNode ; 
                    size--;
                    return removeNode;
                }
            }

            public int removeFromParticularIndex(int k){
                if(k==0) return removeFirst();
                else if (k==size-1) return removeLast();
                else{
                    Node kthminus1 = GetNode(size-1);
                    Node kthnode = kthminus1.next;
                    kthminus1.next=kthnode.next;
                    kthnode.next=null;
                    size--;
                    return kthnode.data;
                }
            }
        


public static void main(String[] args) {
    Implementation sll = new Implementation();
    // sll.head = new Node(10);
    // Node second  = new Node(1);
    // Node third  = new Node(2);
    // Node fourth  = new Node(3);

    // sll.head.next = second;
    // second.next=third;
    // third.next= fourth;
    // fourth.next=null;


    sll.InsertAtLast(1);
    sll.InsertAtLast(2);
    sll.InsertAtLast(4);
    sll.InsertAtLast(5);
    sll.InsertAtLast(6);
    sll.InsertAtParticularIndex(3,2);
    sll.display();
    System.out.println("Size of ll : " + sll.count());
    System.out.println(sll.getFirst());
    System.out.println(sll.getLast());
    System.out.println(sll.getIndex(3));
    System.out.println("Removed Element first:" + sll.removeFirst());
    System.out.println("Removed Element last :" + sll.removeLast());
    System.out.println("Removed Element:" + sll.removeFromParticularIndex(3));
    sll.display();
    // System.out.println(sll.getIndex(7));
    
}
}