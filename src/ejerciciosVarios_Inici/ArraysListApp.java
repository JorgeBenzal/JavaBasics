package ejerciciosVarios_Inici;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lista = Arrays.asList(1,2,3,4);
		pares(lista);
		System.out.println(pares(lista));

	}
	
	public static List<Integer> pares(List<Integer> lista){
		
		List<Integer> lis=new ArrayList<Integer>();
		
		for(Integer Lista : lista) {
			System.out.println(Lista);
			if(Lista%2==0) {
				lis.add(Lista);
			}
		}
		
		return lista;
	}

}
