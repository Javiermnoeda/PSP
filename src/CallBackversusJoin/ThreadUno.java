package CallBackversusJoin;

public class ThreadUno extends Thread {

    ClasePrincipal clasePrincipal;

    public ThreadUno(ClasePrincipal clasePrincipal){
        this.clasePrincipal =  clasePrincipal;
    }

    @Override
    public void run(){ //sobreescribe el metodo run de la clase padre Thread
        try{
            System.out.println("Entro");
            clasePrincipal.decirHola();
            sleep(2000);
            System.out.println("Salgo");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
