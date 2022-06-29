
public class HcfOFTwo {

	public int findHcf(int a, int b) {
		
		int hcf =0;
		
		for(int i=1; i<=a || i<=b; i++) {
			if(a%i==0 && b%i==0) {
				hcf = i;
			}
		}
		return hcf;
	}
	
	public static void main(String args[]) {
		
		HcfOFTwo hs = new HcfOFTwo();
		hs.findHcf(12, 36);
	}
}
