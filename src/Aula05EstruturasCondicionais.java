public class Aula05EstruturasCondicionais {
    public static void main(String[] args){
        int age = 18;
        int permission = 18;

        boolean isAutorizedBuyAlcool = age >= permission ;

        if(isAutorizedBuyAlcool){
            System.out.println("Autorizado a comprar bebida");
        }
        else {
            System.out.println("Não Autorizado");
        }

    }
}
