package sorting;

public class BubbleSort implements Sorting {

	public int[] ordena(int vet[]) {
		int v[] = vet;

		for (int i = v.length; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				if (v[j - 1] > v[j]) {
					int aux = v[j];
					v[j] = v[j - 1];
					v[j - 1] = aux;
				}
			}
                        for (int j : v) {
                        
                    }
		}
		return v;
	}

}
