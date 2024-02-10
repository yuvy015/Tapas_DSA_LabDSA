import java.util.Scanner;
public class BinarySearchTreePairFinderTest {
	
	public static void main(String[] args) {

		test();
	}

	static void test() {
		
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Enter the sum: ");
		int sum = input.nextInt();
		Result result = testFindPair(sum);
		System.out.println(result);
	}

	static Result testFindPair(int sum) {				
		
		BinarySearchTree tree = 
			SampleBinarySearchTrees.sampleBST_01();

		BinarySearchTreePairFinder finder 
			= new BinarySearchTreePairFinder(tree, sum);
		
		Result result = finder.findPair();
		System.out.println();
		return result;		
	}


}
