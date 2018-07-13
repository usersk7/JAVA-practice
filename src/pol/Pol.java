/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pol;

/**
 *
 * @author owner
 */
class Pol {

    void run(){ System.out.println("sum");
            }
    
    void run(int l){ System.out.println("hahahha");
            }
      
    public static void main(String[] args) {

        Pol p = new Pol();
        Pol k = new To();
        
        k.run(3);
        p.run();
        
    }
   
}
  
class To extends Pol{
    void run(){ System.out.println("sksksk");
            }
    void run(int l){ System.out.println("hahahha");
            }
    

}