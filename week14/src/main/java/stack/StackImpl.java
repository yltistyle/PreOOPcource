package stack;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StackImpl<T extends Serializable> implements Stack<T> {
    private final List<T> storage = new ArrayList<>();
    private final Integer size;

    public StackImpl(Integer size) {
        this.size = size;
    }

    @Override
    public void push(T t) {
        if (storage.size() > size) {
            throw new StackOverflowError();
        }
        storage.add(t);
    }

    @Override
    public T pop() {
        T t = storage.get(storage.size() - 1);
        storage.remove(t);
        return t;
    }

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = storage.size() - 1; i >= 0; i--) {
            sb.append(storage.get(i).toString().concat("\n"));
        }
        String delimiter = "*".repeat(storage.get(storage.size() - 1).toString().length());
        return sb.append(delimiter).toString();
    }
}
