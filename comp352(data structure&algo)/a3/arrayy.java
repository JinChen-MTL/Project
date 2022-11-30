public class GenSet<E> {

    private E[] a;

    public GenSet(Class<E> c, int s) {
        // Use Array native method to create array
        // of a type only known at run time
        @SuppressWarnings("unchecked")
        final E[] a = (E[]) Array.newInstance(c, s);
        this.a = a;
    }

    E get(int i) {
        return a[i];
    }
}
class arrayy<T> {

	private T arr[];
	private int count;

	// Note they can only be called through function


	public void insert(entry k) {
		if (arr.length == count) {
			// Creating a new array double the size
			// of array declared above
			T newArr[] = new T[2 * count];
			// Iterating over new array using for loop
			for (int i = 0; i < count; i++) {
				newArr[i] = arr[i];
			}
			// Assigning new array to original array
			// created above
			arr = newArr;
		}
		arr[count++] = k;
	}
}