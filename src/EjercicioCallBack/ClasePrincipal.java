package EjercicioCallBack;

public class ClasePrincipal {

    public  ClasePrincipal() throws InterruptedException {
        Hilo Hilo1 = new Hilo();
        HiloCallBack Hilo2 = new HiloCallBack(this); //solo se pone this por que le dices al programa que quieres pasar esta clase
        Hilo1.start();
        Hilo1.join();
        Hilo2.start();

    }

    public void MiFuncion(String MiString, String MiString2){
        System.out.println(MiString);
        System.out.println(MiString2);
    }


}
