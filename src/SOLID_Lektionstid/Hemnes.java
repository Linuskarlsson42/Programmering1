package SOLID_Lektionstid;

public class Hemnes implements Ikea{

	@Override
	public void Material() {
		// TODO Auto-generated method stub
		System.out.println("Tr�fiberskiva, Akrylf�rg, Polyesterf�rg");
	}

	@Override
	public void Price() {
		// TODO Auto-generated method stub
		System.out.println("Denna vackra soffa kommer kosta dig en fina 3295 svenska riksdaler");
	}

	@Override
	public void Name() {
		// TODO Auto-generated method stub
		System.out.println("Hemnes:");
	}

	@Override
	public void Color() {
		// TODO Auto-generated method stub
		System.out.println("Hemnes kommer i tv� fina f�rger. Vit och gr�tt");
	}

	@Override
	public void Kopa() {
		// TODO Auto-generated method stub
		System.out.println("JA s�klart de ju �nd� en fin soffa att st�lla i k�ket eller hallen!");
	}

}
