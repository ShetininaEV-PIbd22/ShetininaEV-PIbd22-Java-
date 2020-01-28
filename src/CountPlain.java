
public enum CountPlain {
	Three,
    Four,
    Five,
    Six;
	
	public int count()
	{
		if (this == Three) return 3;
		else if (this==Four) return 4;
		else if (this==Five) return 5;
		else return 6;
	}
}
