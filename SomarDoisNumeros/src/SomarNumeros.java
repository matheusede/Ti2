import java.util.*;
class SomarNumeros{
    public static Scanner keyboard = new Scanner(System.in);

    @Override
	public String toString() {
		return "SomarNumeros []";
	}

    public static void main (String args[]){
        int n1, n2, result;
        System.out.println("Insira dois números inteiros.\n");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        result = n1 + n2;
        System.out.println("Soma = " + result + ".\n");
    }
}