public interface MyArrayListTAD {

    void addLast(int newItem);
    void addFirst(int newItem);
    void insertAt(int index, int newItem);
    void addSorted(int newItem);
    void removeLast();
    void removeFirst();
    void removeAt(int index);
    void remove(int item); // Remove por valor (ex: remover o número 30)
    int find(int item);
    int get(int index);
    void set(int index, int newItem);
    boolean isEmpty();
    boolean isFull();
    int count();
    void display();
}
