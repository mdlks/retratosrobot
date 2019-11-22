import java.util.Scanner;

public class RetratosRobot {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int opcion=1;
		int pelo;
		int ojo;
		int nariz;
		int boca;
		int barbilla;
		
		String pelos [] = new String[4];
		pelos[0]="WWWWWWWWW";
		pelos[1]="\\\\\\//////";
		pelos[2]="\"\"\"\"\"\"\"\"\"";
		pelos[3]="|||||||||"; 
		
		String ojos[] = new String[4];
		ojos[0]="| O   O |";
		ojos[1]="|-(. .)-|";
		ojos[2]="|-(o o)-|";
		ojos[3]="| \\   / | ";
		
		String narices[] = new String[4];
		narices[0]="@   J   @";
		narices[1]="{   \"   }";
		narices[2]="[   j   ]";
		narices[3]="<   -   >";
		
		String bocas[]= new String[4];
		bocas[0]="|  ===  |";
		bocas[1]="|   -   |";
		bocas[2]="|  ___  |";
		bocas[3]="|  ---  |";
		
		String barbillas[]= new String[2];
		barbillas[0]="\\_______/";
		barbillas[1]="\\,,,,,,,/";
		
		
		while (opcion != 0)
		{
			System.out.println("Elige primero el PELO.");
			System.out.println("----------------------");
			for ( int i=0; i<pelos.length;i++)
			{
				System.out.println("opcion"+(i+1)+ ":"+pelos[i] );
				System.out.println();
				
			}
			pelo=sc.nextInt();
			while (pelo<1||pelo>4)
			{
				System.out.println("dime número válido");
				pelo=sc.nextInt();
			}
				
			System.out.println("Elige ahora los OJOS.");
			System.out.println("---------------------");
			for ( int i=0; i < ojos.length;i++)
			{
				System.out.println("opcion "+(i+1)+ ": "+ojos[i]);
				System.out.println();
				
			}
			ojo=sc.nextInt();
			while (ojo<1||ojo>4)
			{
				System.out.println("dime número válido");
				ojo=sc.nextInt();
			}
			System.out.println("Elige la NARIZ.");
			System.out.println("---------------");
			for ( int i=0; i < narices.length;i++)
			{
				System.out.println("opcion"+(i+1)+ ":"+narices[i]);
				System.out.println();
				
			}
			nariz=sc.nextInt();
			while (nariz<1||nariz>4)
			{
				System.out.println("dime número válido");
				nariz=sc.nextInt();
			}
			System.out.println("Elige la BOCA.");
			System.out.println("--------------");
			for ( int i=0; i < bocas.length;i++)
			{
				System.out.println("opcion"+(i+1)+ ":"+bocas[i]);
				System.out.println();
				
			}
			boca=sc.nextInt();
			while (boca<1||boca>4)
			{
				System.out.println("dime número válido");
				boca=sc.nextInt();
			}
			System.out.println("Escoge la BARBILLA");
			System.out.println("-----------------");
			for ( int i=0; i < barbillas.length;i++)
			{
				System.out.println("opcion"+(i+1)+ ":"+barbillas[i]);
				System.out.println();
				
			}
			barbilla=sc.nextInt();
			while (barbilla<1||barbilla>2)
			{
				System.out.println("dime número válido");
				barbilla=sc.nextInt();
			}
			
			System.out.println(pelos[pelo-1]);
			System.out.println(ojos[ojo-1]);
			System.out.println(narices[nariz-1]);
			System.out.println(bocas[boca-1]);
			System.out.println(barbillas[barbilla-1]);
			
			System.out.println();
			System.out.println("si quieres salir pulsa 0 cualquier otro número para continuar.");
			opcion=sc.nextInt();
		}
		sc.close();
	}

}
