package Days19;

public class PrimitivesVSWrapper {

	public static void main(String[] args) {
		
		Integer intV = new Integer(234);
		//this is object and we are compareing to premitive
		Integer intV2 = new Integer(234);
		
		System.out.println(intV == 234); // true
		//because intV is unboxed to a primitive then
		//compare with 234 primitive
		
		System.out.println(intV == intV2); // false
		//because it is compareing two different object
		//and they are reffering two differnt object
		// 2:15 minites
	}

}
