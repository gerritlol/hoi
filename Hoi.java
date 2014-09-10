
public class Hoi
{

    private int getal;
  
    
    public Hoi(int getGetal)
    {
        getal = getGetal;
    }
    
    public int geefKleinsteDeler() {
        int kleinste = 0;
        //int currendNumber = 0;
        for(int x = getal; x > 1; x--) {
            if( getal%x == 0 ) {
                kleinste = x;
            }
        }
        return kleinste;
    }
    
      public int geefGrootsteDeler() {
        int grootste = 0;
        //int currendNumber = 0;
        for(int x = 1; x < getal; x++) {
            if( getal%x == 0 ) {
                grootste = x;
            }
        }
        return grootste;
    }
    
    public boolean isPriem() {
        if ( geefGrootsteDeler() == 1 ) {
            return(true);
        }
        else {
            return(false);
        }
        
    }
    
    public int geefCrijferSom() {
        int som = 0;
        int getal1 = 0, getal2 = 0, tempGetal = 0;
        tempGetal = getal;
        while( tempGetal > 0 ) {
            if( tempGetal > 99 ) {
        getal1 = tempGetal%10;
        tempGetal = (tempGetal - getal1)/10;
        som += getal1;
    }
    else {
        getal1 = tempGetal%10;
        getal2 = tempGetal/10;
        som = som + getal1 + getal2;
        tempGetal = 0;
    }    
    }
        return(som);
    }
    
    public int geefFaculteit() {
        //int[] array1;
        int hoeveelheid=1;
        //array1 = new int[getal];
        for(int b = 1 ; b < getal; b++) {
            //array1[x] = x+1;
            hoeveelheid = hoeveelheid *b;
         
        }
        return hoeveelheid;
    }
    
    public boolean geefPerfectGetal() {
       //int[] array1;
       //array1 = new int[getal];
       int totaal = 0;
       for(int x = 1; x < getal; x++) {
           if(getal%x == 0) {
               //array1[x] = x;
           totaal +=x;
        }
        
        
    }
    if ( totaal == getal ) {
        return true;
    }
    else {
        return false;
    }
}
}
