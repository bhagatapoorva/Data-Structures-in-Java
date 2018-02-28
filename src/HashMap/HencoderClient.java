package HashMap;

public class HencoderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HEncoder code = new HEncoder("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbccccccccdd");
        System.out.println(code.compress("aabbccdd"));
        System.out.println(code.decompress("110101001001000000"));
	}

}
