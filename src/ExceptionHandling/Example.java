package ExceptionHandling;

public class Example {

	public static void main(String args[]) {
		//String[] a= new String[5];
		//String b[]= new String[4];
		System.out.println(args.length);
		try {
			int i[]= new int[1];
			System.out.println(i[2]);
		} catch (Throwable e) {
			System.out.println("I am in catch block");
			e.printStackTrace();
		}finally {
			System.out.println("I am in finally block");
		}

	}
}
