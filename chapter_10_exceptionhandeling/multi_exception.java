//multiple exception with multiple catch
class multi_exception{
	public static void main(String []args){
		System.out.println("before");
		try{
			int b[]=new int[3];
			b[10]=9;
			int a=5/0;
		}
		catch (ArithmeticException a){
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("after");
	}
}
//only ArrayIndexOutOfBoundsException will be handeled as it is in first in try