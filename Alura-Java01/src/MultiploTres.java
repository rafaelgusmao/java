
public class MultiploTres {
	public static void main(String[] args) {
		for(int contador =1 ;contador*3<=100;contador=contador + 1) {
			System.out.print(contador*3);
			System.out.print(contador*3 % 3);
			System.out.println();
		}
	}
}
