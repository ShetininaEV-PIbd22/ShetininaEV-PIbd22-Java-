
public enum PlaneType {
	Type1,
	Type2,
	Type3;
	
	public IPlain create()
	{
		if (this==Type1) return new Plain1();
		else if (this==Type2) return new Plain2();
		else if (this==Type3) return new Plain3();
		
		return null;
	}
}
