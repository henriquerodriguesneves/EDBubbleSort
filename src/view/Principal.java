package view;

import controller.BubbleSort;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {2,0,1,3,7,8,5,4,9,6};
		
		BubbleSort oCont = new BubbleSort();
		
		vetor = oCont.bubbleSort(vetor);
		
		System.out.println("");
		System.out.println("=======================================");
		for (int valor : vetor) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("=======================================");

	}

}