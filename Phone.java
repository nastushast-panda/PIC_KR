public class Phone
{
	private String phone_brand;
	private double  diagonal;
	private int battery;
	private boolean nfc;
	private String processor_brand;
	private int inner_memory;
	private int ram;
	private String Operation_system;
	
	public String toString()
	{
		String str = phone_brand + ", " + diagonal + "diag, " + battery + "mAh, nfc:" + nfc + ", " + processor_brand + ", " + inner_memory + "/" + ram + "Gb, " + Operation_system;
		return str;
	}
	
	public static class Builder
	{
		private Phone newPhone;
		
		public Builder()
		{
			newPhone = new Phone();
		}
		
		public Builder withPBrand(String p_brand)
		{
			newPhone.phone_brand = p_brand;
			return this;
		}
		
		public Builder withDiagonal(double n_diagonal)
		{
			newPhone.diagonal = n_diagonal;
			return this;
		}
		
		public Builder withBattery(int n_battery)
		{
			newPhone.battery = n_battery;
			return this;
		}
		
		public Builder withNFC(boolean n_nfc)
		{
			newPhone.nfc = n_nfc;
			return this;
		}
		
		public Builder withPrBrand(String pr_brand)
		{
			newPhone.processor_brand = pr_brand;
			return this;
		}
		
		public Builder withIMemory(int n_memory)
		{
			newPhone.inner_memory = n_memory;
			return this;
		}
		
		public Builder withRAM(int n_RAM)
		{
			newPhone.ram = n_RAM;
			return this;
		}
		
		public Builder withOC(String n_OC)
		{
			newPhone.Operation_system = n_OC;
			return this;
		}
		
		public Phone build()
		{
			return newPhone;
		}
	}
	
	
}