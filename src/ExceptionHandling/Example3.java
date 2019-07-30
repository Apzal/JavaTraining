package ExceptionHandling;

public class Example3 {
	public static void main(String[] args) {
//		try {
//			int i=9;
//			int j=8;
//			if(i==j) {
//			throw new Exception("It is customised exception");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
