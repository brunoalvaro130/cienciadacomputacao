
package App;

public class Main {

   
    
    public static void main(String[] args) {
        
        Celular cl = new Celular("LG", "K11+", 600,"Americanas" , 100 );      
        cl.status();
        
        Computador cp = new Computador ("Positivo", 1249, "Americanas", 100, "Intel Dual Core");
        cp.status();
        
        //MateriaPrima mp = new MateriaPrima("Laranja");
        //mp.status();
        
        /***
        System.out.println(mp.getEstoque());
        mp.setEstoque(100);
        System.out.println(mp.getEstoque());
        mp.setEstoque(200);
        System.out.println(mp.getEstoque());
        
        System.out.println(mp.getNome());
        System.out.println(mp.getEstoque());
        mp.setNome("Morango");
        System.out.println(mp.getNome());
        mp.setEstoque(100);
        mp.setNome("Banana");
        mp.setTaxa((float) 2.3);
        
        System.out.println(mp.getEstoque());
        mp.addQtd(20);
        System.out.println(mp.getEstoque());
        mp.addQtd(18);
        System.out.println(mp.getEstoque());
        mp.subQtd(25);
        System.out.println(mp.getEstoque());
        ***/
        
        System.out.println("end application!");
    }
    
}
