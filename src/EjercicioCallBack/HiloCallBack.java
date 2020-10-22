package EjercicioCallBack;

public class HiloCallBack extends Thread{
    ClasePrincipal variable;
    public HiloCallBack(ClasePrincipal variable){
        this.variable = variable;
    }
    @Override
    public void run() {
        int contador=0;
        Long tiempo=System.currentTimeMillis();

            try {
                for(int i = 0;i<Main.numaleatorio;i++){
                    sleep(2000);
                    contador++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        Long finalTiempo =System.currentTimeMillis()-tiempo;
        variable.MiFuncion("El Hilo se ha ejecutado: "+contador+" veces","Ha tardado: "+finalTiempo/1000 +" segundos");
    }
}
