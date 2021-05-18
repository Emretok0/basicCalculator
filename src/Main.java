import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int i1,i2,select;
		System.out.print("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\n\nİşleminizi Seçiniz: ");
		select = inp.nextInt();
		System.out.print("1. Sayı: ");
		i1 = inp.nextInt();
		System.out.print("2. Sayı: ");
		i2 = inp.nextInt();

		switch (select){
			case 1:
				System.out.println(i1+" + "+i2+" = "+(i1+i2));
				break;
			case 2:
				System.out.println(i1+" - "+i2+" = "+(i1-i2));
				break;
			case 3:
				System.out.println(i1+" * "+i2+" = "+(i1*i2));
				break;
			case 4:
				if (i2!=0){
					System.out.println(i1+" / "+i2+" = "+(i1/i2));
					break;
				}else{
					System.out.println("Bir sayı sıfıra bölünemez. Lütfen tekrar deneyiniz.");
					break;
				}
			default:
				System.out.println("Lütfen 1-4 arası seçim yapınız.");
				break;
		}
	}
}
