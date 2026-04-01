public class MyArrayList implements MyArrayListTAD {
    private int[] items;
    private int count;
    private int capacity;

    public MyArrayList(int size) {
        this.capacity = size;
        this.items = new int[capacity];
        this.count = 0;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean isFull() {
        return count == capacity;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public void addLast(int newItem) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }

        items[count] = newItem;
        count += 1;
    }

    @Override
    public void addFirst(int newItem) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }

        for (int i = count; i > 0; i--) {
            items[i] = items[i - 1];
        }

        items[0] = newItem;
        count += 1;
    }

    @Override
    public void insertAt(int index, int newItem) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }

        if (index < 0 || index > count) {
            System.out.println("Erro: Índice inválido!");
            return;
        }

        for (int i = count; i > index; i--) {
            items[i] = items[i - 1];
        }

        items[index] = newItem;
        count += 1;
    }

    @Override
    public void addSorted(int newItem) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }

        int i = count - 1;

        while (i >= 0 && items[i] > newItem) {
            items[i + 1] = items[i];
            i = i - 1;
        }

        items[i + 1] = newItem;
        count += 1;
    }

    @Override
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Erro: Lista vazia!");
            return;
        }

        count -= 1;
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Erro: Lista vazia!");
            return;
        }

        for (int i = 0; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

        count -= 1;
    }

    @Override
    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Erro: Índice inválido!");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    @Override
    public void remove(int item) {
        int index = find(item);

        if (index != -1) {
            removeAt(index);
            System.out.println("Item " + item + " removido com sucesso.");
        } else {
            System.out.println("Erro: Item " + item + " não encontrado na lista.");
        }
    }

    @Override
    public int find(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Erro: Índice " + index + " fora dos limites.");
        }

        return items[index];
    }

    @Override
    public void set(int index, int newItem) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Erro: Índice " + index + " inválido para alteração.");
        }

        items[index] = newItem;
    }

    @Override
    public void display() {
        System.out.print("Lista atual: [ ");

        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }

        System.out.println("]");
    }
}