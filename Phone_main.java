public class Phone_main
{
	public static void main(String[] args)
	{
		Phone myPhone1 = new Phone.Builder()
				.withPBrand("Xiaomi")
				.withDiagonal(6.5)
				.withBattery(5000)
				.withNFC(true)
				.withPrBrand("Helio G88")
				.withIMemory(128)
				.withRAM(8)
				.withOC("Android 11")
				.build();
		
		Phone myPhone2 = new Phone.Builder()
				.withPBrand("Sumsung")
				.withBattery(5000)
				.withPrBrand("Helio G88")
				.withIMemory(128)
				.withRAM(8)
				.build();
		
		System.out.println(myPhone1.toString());
		System.out.println(myPhone2.toString());
	}
}