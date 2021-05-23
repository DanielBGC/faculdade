package sorting;

public class SelectionSort implements Sorting

{

	// SELECTION SORT
        @Override
	public int[] ordena(int vet[]) {
		int index_min;
		int aux;

		int v[] = vet;

		for (int i = 0; i < v.length - 1; i++) {
			index_min = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[index_min]) {
					index_min = j;
				}
			}
			if (index_min != i) {
				aux = v[index_min];
				v[index_min] = v[i];
				v[i] = aux;
			}
		}
		return v;
	}

}
