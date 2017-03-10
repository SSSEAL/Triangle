package lab1;

public class triangle {
    public String cal(int a,int b,int c) {
    	if(a + b > c && b + c > a && a + c > b)
    	{
    		if(a == b && b == c)
    			return "equilateral";
    		else if(a == b || b == c || c == a)
    			return "isosceles";
    		else {
    			return "scalene";
    		}
    	}
    	else
    		return "Not a triangle";
    }
}