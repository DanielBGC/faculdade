package sorting;

//usado quando os dados est�o organizados

public class InsertionSort implements Sorting{

	@Override
	public int[] ordena(int[] x) {
		int nome[] = x;
		int num = 0;
		for (int i = 0; i < nome.length; i++) {
			num = nome[i];
			for (int j = i - 1; (j >= 0) && (nome[j] > num); j--) {
				nome[j + 1] = nome[j];
				nome[j] = num;
			}
		}
		return nome;
	}

}
