/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author isharaLakshitha
 */
import java.util.ArrayList;

interface Iterator {

    public abstract boolean hasNext();

    public abstract Object next();
}

class ArrayIterator implements Iterator {

    private final Object array[];
    private int index;

    public ArrayIterator(Object[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Object next() {
        return array[index++];
    }
}

class ArrayListIterator implements Iterator {

    private final ArrayList list;
    private int index;

    public ArrayListIterator(ArrayList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        return list.get(index++);
    }
}

class Test {

    public static void main(String[] args) {
        // Array
        String array1[] = {"Java", "PHP", "C#"};

        // ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("PHP");
        list1.add("C#");

        Iterator iterator1 = new ArrayIterator(array1);
        Iterator iterator2 = new ArrayListIterator(list1);

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
