/* CODING 2 - PROBLEM SET 2.2

For this exercise, you are going to complete the printScope() method in the Scope class. Then you will create a Scope object in the ScopeTester and call printScope. The method will print the name of each variable in the Scope class, as well as its corresponding value. There are 5 total variables in the Scope class, some of which can be accessed directly as instance variables, others of which need to be accessed via their “get” methods. For any variable that can be accessed directly, use the variable name. Otherwise, use the “get” method.

Sample Output:
The output of the printScope method should look like this:
t = 39
w = 24
x = 3
y = 18
z = 21

*/

public class Scope {
    private int x;
    private int y;
    private int z;

    public Scope() {
        x = 3;
        y = 18;
        z = 21;
    }

    public void printScope(){
       // Start here!
    }

	 public int getX() {
		return x;
	 }

	 public int getY() {
		return y;
	 }

	 public int getZ() {
		return z;
	 }

    public int getW(){
        int w = x + z;
        return w;
    }

	public int getT() {
        int t = y + z;
		return t;
	}
}
