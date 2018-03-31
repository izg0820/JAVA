
public class SubstitutionCipher implements MessageEncoder{
	
	private int shift;
	public SubstitutionCipher(int shift){
		this.shift=shift;
	}
	public String encode(String plainText){
		int len;
		String term = "";
		len= plainText.length();
		for(int i=0;i<len;i++){
			term=term+(char) (plainText.charAt(i)+shift);
		}
		return term;

	}

}
