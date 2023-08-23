
public class ciclo_foreach {

	public static void main(String[] args) {
		int[] panes = {10, 4,2 ,15, 23};
		//este ciclo for each agarra cada elemento del array panes y imprime el doble.
		for(int pan : panes) {
			System.out.printf("%d ", pan *2);
		}
	}

}
