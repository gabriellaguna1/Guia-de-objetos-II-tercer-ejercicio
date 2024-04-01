import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client c= new Client("Gabriel", "m");
        c.showClient(c);

        Count cuenta= new Count(10000d, c);

        System.out.println("depositanto $15.000");
        cuenta.setBalanceDepositar(15000d);
        System.out.println("nuevo saldo: "+cuenta.getBalance());
        System.out.println("extrayendo 30000");
        cuenta.setBalanceExtraer(30000d);
        System.out.println("nuevo saldo: "+cuenta.getBalance());

        List<Movements>movimientos= new ArrayList<>();

        Scanner escaner= new Scanner(System.in);
        Double n;
        System.out.println("Ingresando 10 movimientos: ");
        for(int i=0;i<10; i++){
            System.out.println("Ingrese movimiento (negativo si es debito, positivo si es credito:");
            n=escaner.nextDouble();
            if(n<0){
                movimientos.add(new Movements(c, n));
                cuenta.setBalanceExtraer(-1*n);
            }else {
                movimientos.add(new Movements(c, n));
                cuenta.setBalanceDepositar(n);
            }

        }

        for(Movements m: movimientos){
            if(m.amount<0){
                System.out.println("el cliente "+m.name.getName()+" retiro "+m.amount);
            }else{
                System.out.println("el cliente "+m.name.getName()+ " deposito "+m.amount);
            }
        }

        System.out.println("mostrando monto final: "+cuenta.getBalance());




    }
}