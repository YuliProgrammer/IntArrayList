package com.arrlist;

public interface IntList {

    void add(int value); // Добавляет указанный элемент в конец этого списка (необязательная операция).

    void add(int index, int element); // Вставляет указанный элемент в указанную позицию в этом списке (необязательная операция).

    void clear();  // Удаляет все элементы из этого списка (необязательная операция).

    boolean contains(int value); // Возвращает true, если этот список содержит указанный элемент.

    int get(int index);  // Возвращает элемент в указанной позиции в этом списке.

    boolean isEmpty(); // Возвращает true, если этот список не содержит элементов.

    int remove(int index); // Удаляет элемент в указанной позиции в этом списке (необязательная операция).

    void set(int index, int element); // Заменяет элемент в указанной позиции в этом списке на указанный элемент (необязательная операция).

    int size(); // Возвращает количество элементов в этом списке.
}
