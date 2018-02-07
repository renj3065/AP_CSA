package unit3;

public class Quadratic {
	
		private int a, b, c;
		private double rootOne;
		private double rootTwo;


		public Quadratic(int quadA, int quadB, int quadC)
		{

			setEquation(quadA,quadB,quadC);
		}

		public void setEquation(int quadA, int quadB, int quadC)
		{
			a=quadA;
			b=quadB;
			c=quadC;

	 	}

		public void calcRoots( )
		{
			rootOne=((double)(-b)+Math.sqrt(b*b-4*a*c))/(2*a);
			rootTwo=((double)(-b)-Math.sqrt(b*b-4*a*c))/(2*a);
			
		}

		public void print( )
		{
			System.out.println("root one :: "+String.format("%.2f",rootOne));
			System.out.println("root two :: "+String.format("%.2f",rootTwo));

		}
	}

