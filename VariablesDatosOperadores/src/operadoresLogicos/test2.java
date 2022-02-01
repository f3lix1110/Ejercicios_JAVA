package operadoresLogicos;

public class test2 {
	public static void main(String[] args)
    {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
 
String s1 = new String("GEEKS");
String s2 = new String("GEEKS");
 
System.out.println(t1 == t2);//no son el mismo espacio de memoria
System.out.println(t1 == t3);//en el mismo espacio de memoria
System.out.println(s1 == s2);//no son el mismo espacio de memoria
 
        System.out.println(t1.equals(t2)); //no puedes igualar cosas indefinidas
        System.out.println(s1.equals(s2)); //equals checa el contenido y es el mismo
    }

}
