package besinciHafta;

public class ornek2 {

	public static void main(String[] args) {
		
		int[] yanitlar = {3, 4, 2, 5, 4, 3, 1, 2, 3, 4, 5, 4, 3, 2, 1, 4, 5, 3, 4, 2};
        int[] dereceler = new int[5];
        
        for (int i = 0; i < yanitlar.length; i++) {
            int derece = yanitlar[i];
            dereceler[derece - 1]++; 
        }
        
        for (int i = 0; i < dereceler.length; i++) {
            int derece = i + 1; 
            int count = dereceler[i]; 
            System.out.println("Derece " + derece + ": " + count + " yanıt");
        }
	}
}
