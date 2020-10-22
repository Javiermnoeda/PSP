package CallBackversusJoin;

public class ClasePrincipal {

    //la calse principal se crea para llamarla desde el main
    public ClasePrincipal() throws InterruptedException{
        System.out.println("ClasePrincipal - Entro");
        ThreadUno t1 = new ThreadUno(this); //crea un objeto
        t1.start();//Incia el hilo o llamar al metodo run
        t1.join();//Le dice al programa que hasta que no acabe ese hilo el programa no ejecuta las siguientes lineas de codigo
        decirHola();
        System.out.println("ClasePrincipal - Salgo");

    }

    public void decirHola(){
        System.out.println("Hola");
    }

}
