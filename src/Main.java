import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] kategori;
        String[] jenis, potongan;
        potongan = new String[5];
        kategori = new char[5];
        jenis = new String[5];
        double[] harga, diskon;
        harga = new double[5];
        diskon = new double[5];
        double total = 0;
        char up;
        for (int i = 0; i < 5; i++){
        	do {
        		String a = " ";
        		System.out.print("Masukkan Kategori barang (A / B / C) : ");
                a = scan.nextLine();
                kategori[i] = a.toUpperCase().charAt(0);
                
                up = kategori[i];
        	} while (up!='A' && up!='B' && up!='C');
        	
            System.out.print("Masukkan Jenis Pakaian: ");
            jenis[i] = scan.nextLine();
            System.out.print("Masukkan Harga Pakaian: ");
            try {
            	harga[i] = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				// TODO: handle exception
			}
            
            
            switch (kategori[i]){
            	case 'a':
                case 'A':
                	diskon[i] = harga[i] - (harga[i] * 0.1);
                    potongan[i] = "(diskon 10%)";
                    break;
                case 'b':
                case 'B':
                	diskon[i] = harga[i] - (harga[i] * 0.15);
                    potongan[i] = "(diskon 15%)";
                    break;
                case 'c':
                case 'C':
                	diskon[i] = harga[i] - (harga[i] * 0.25);
                    potongan[i] = "(diskon 25%)";
                    break;
            }
            total = total + diskon[i];
//            char upper = kategori[i].toUpperCase();
            System.out.println((i+1)+". "+up+": "+jenis[i]+" "+harga[i]+" "+potongan[i]+" ---> "+diskon[i]);
        }
        System.out.println("======================================================================================");
        System.out.println("KATEGORI\tJENIS\t\tHARGA\t\tPOTONGAN\tSETELAH DISKON");
        System.out.println("======================================================================================");
        for (int j = 0; j<5; j++){
            System.out.println(kategori[j] + "\t\t" + jenis[j] + "\t\t" + harga[j] + "\t\t" +potongan[j]+ "\t" + diskon[j]);
//            System.out.println("Kategori : "+kategori[j]);
//            System.out.println("Jenis : "+jenis[j]);
//            System.out.println("Harga : "+harga[j]);
//            System.out.println("Setelah Diskon : "+diskon[j]);
//            System.out.println("Potongan : "+potongan[j]);
        }
        System.out.println("TOTAL HARGA : " + total);
    }


	public Main() {
		// TODO Auto-generated constructor stub
		
	}

}
