
public class ShuffleCipher implements MessageEncoder{

	private int time;
	public ShuffleCipher(int n){
		this.time = n;
	}

	public String encode(String plainText){
		int len=plainText.length(),count=1;
		String term1=plainText.substring(0, len/2);
		String term2=plainText.substring(len/2, len);
		String s="";

		while(count<=time){
			for(int i=0;i<len/2;i++){
				s= s+term1.charAt(i)+term2.charAt(i);
			}
			count++;
		}
		return s;
	}


}
