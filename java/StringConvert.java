class StringConvert{
	public static void main(String[] args){
		String a = "9";
		String b = "10";

		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);

		double a2 = Double.parseDouble(a);
		double b2 = Double.parseDouble(b);

		float a3 = Float.parseFloat(a);
		float b3 = Float.parseFloat(b);

		System.out.println("Result in Integer: " + (a1*b1));
		System.out.println("Result in Double : " + (a2*b2));
		System.out.println("Result in Float  : " + (a3*b3));

	}
}
