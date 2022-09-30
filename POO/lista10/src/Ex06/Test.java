package Ex06;
class Level1Exception extends Exception{}
class Level2Exception extends Level1Exception{}
class Level3Exception extends Level2Exception{}
public class Test {
	public static void main(String[] args) {
		int a,b,c,d,f,g,x;
		a=b=c=d=f=g=0;
		x= Integer.parseInt(args[0]);
		try {
			try {
				switch(x) {
				case 0:
					throw new Level1Exception();
				case 1:
					throw new Level2Exception();
				case 2:
					throw new Level3Exception();
				case 3:
					throw new Exception();
				}
				a++;
			}catch(Level2Exception e) {
				b++;
			}finally {
				c++;
			}
		}catch(Level1Exception e) {
			d++;
		}catch(Exception e) {
			f++;
		}finally {
			g++;
		}
		System.out.println(a +","+ b +","+ c +","+ d +","+ f +","+ g +",");
	}
}
/*
 * Primeiramente, ao se tentar executar o código disponibilizado, ocorrerá um erro de execução, pois o mesmo não
 * pode ser compilado corretamente
 * 
 * caso a entrada seja: a saida será
 * 0:		 0, 0, 0, 1, 0, 1
 * 1: 		 0, 1, 1, 0, 1, 1
 * 2:        0, 0, 0, 0, 1, 1
 * 3: 	     0, 0, 0, 0, 1, 1
 * 4: 	     0, 0, 1, 0, 1, 1 */
