import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class isAbdelBallin {

	public static void main(String[] args) {
		ArrayList<Abdel> a = new ArrayList<Abdel>();
		for(int i = 0; i < 1000; i++) {
			a.add(new Abdel()); //list of 1000 abdels just to prove how he can never be ballin' no matter how many of him there are
		}
		Collections.shuffle(a);
		//shuffle the abdels
		Random randomseed = new Random();
		Random rng = new Random(a.get(0).getAge() + randomseed.nextInt() * a.get(randomseed.nextInt(1000)).getAge() * 0x213123 % a.get(0).getName().length());
		//gotta pick a random abdel from all the identical abdels for scientific purposes
		Collections.shuffle(a);
		//shuffe the abdels
		Abdel primeAbdel = a.get(rng.nextInt(1000)); // the chosen abdel
		if(primeAbdel.getName().equals("Abdel")) { //all these checks are just to really make sure that it really is abdel
			if(primeAbdel.getAge() == 19) {
				if(primeAbdel.isCringe()) {
					if(primeAbdel.isUnbased()) {
						if(primeAbdel.isBallin()) {
							System.out.println("Abdel is ballin'");
						}
						else {
							System.out.println("Abdel could never be ballin'");
						}
					}
				}
			}
		}
	}

}
