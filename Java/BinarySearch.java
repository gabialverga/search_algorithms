

public class BinarySearch {
    
    
    /**
     * Usando busca binária, procura o número "x" no array.
     * Retorna true caso ache, false caso não.
     */
	public boolean searchNumber(int[] array, int x) {
		return binarySearch(array, x, 0, array.length - 1);
	}
	
	private boolean binarySearch(int[] array, int x, int leftIndex, int rightIndex) {
		
		if(leftIndex > rightIndex) {
			return false;
		}
		
		int middleIndex = (rightIndex + leftIndex) / 2;
		
		if(array[middleIndex] == x) {
			return true;
		} else if (array[middleIndex] < x) {
			return binarySearch(array, x, middleIndex + 1, rightIndex);
		} else {
			return binarySearch(array, x, leftIndex, middleIndex - 1);
		}
	}

}