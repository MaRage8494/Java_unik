package Task21;

public class ArrayStorage<E>{

    private E[] array;
    public int length;
    public E get(int index){
        return array[index];
    }

    public void setArray(E[] array){
        this.array = array;
        length = array.length;
    }

}
