public interface MyQueue<T> {
    boolean add(T value);
    //지정된 객체를 Queue에 추가
    //저장공간 부족 시 IllegalStateException 발생


    T remove();
    //Queue에서 객체를 꺼내 반환
    //비어있을 경우 NoSuchElementException 발생


    T element();
    //삭제없이 요소를 읽어온다
    //비어있을 경우 NosuchElementException 발생


    boolean offer(T value);
    //Queue에 객체를 저장


    T poll();
    //Queue에서 객체를 꺼내서 반환
    //비어있을 경우 null을 반환


    T peek();
    //삭제없이 요소를 읽어온다
    //비어있을 경우 null을 반환

    boolean queueIsEmpty();
    //큐 안이 비었는지 판단하는 함수
    boolean queueIsFull();
    //배열의 최대크기를 벗어나면 안되기에 큐에 더이상 들어갈 공간이 없는지 판단하는 함수
    int size();
    //queue에 현재 들어가 있는 데이터의 개수를 return하는 함수
}
