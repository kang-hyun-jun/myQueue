import java.util.NoSuchElementException;

public class MyLinkedListQueue<E> implements MyQueue<E>{

    private Node<E> head;
    private Node<E> tail;
    private int size;
    MyLinkedListQueue() {
        this.head =null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean queueIsEmpty(){
        if(size ==0){
            return true;
        }
        return false;
    }
    //큐 안이 비었는지 판단하는 함수

    @Override
    public boolean add(E value){
        Node<E> newNode = new Node<>(value);
        if(size ==0){
            this.head = newNode;
        }
        else{
            this.tail.next = newNode;
        }
        size++;
        this.tail = newNode;

        return true;
    }
    //지정된 객체를 Queue에 추가
    //저장공간 부족 시 IllegalStateException 발생(단, 지금은 링크드라스트를 기반으로 한 큐 이기에 문제없음.)

    @Override
    public E remove(){
        if(queueIsEmpty())
        {
            throw new RuntimeException(new NoSuchElementException());
        }
        else
        {
            E temp = head.data;
            Node nextNode = head.next;
            head.next = null;
            head.data = null;
            head = nextNode;

            size--;
            return temp;
        }
    }
    //Queue에서 객체를 꺼내 반환
    //비어있을 경우 NoSuchElementException 발생

    @Override
    public E element(){
        return null;
    }
    //삭제없이 요소를 읽어온다
    //비어있을 경우 NosuchElementException 발생

    @Override
    public boolean offer(E value){
        return false;
    }
    //Queue에 객체를 저장

    @Override
    public E poll(){
        return null;
    }
    //Queue에서 객체를 꺼내서 반환
    //비어있을 경우 null을 반환

    @Override
    public E peek(){

        return null;
    }
    //삭제없이 요소를 읽어온다
    //비어있을 경우 null을 반환

    @Override
    public boolean queueIsFull(){
        return false;
    }
    //배열의 최대크기를 벗어나면 안되기에 큐에 더이상 들어갈 공간이 없는지 판단하는 함수

    @Override
    public int size(){
        return 0;
    }
}
