import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Nikolaus22 {
    String[] geschenkeSack;
    String goldenesBuch;
    int geschenkeImSack;

    Nikolaus22(String gB){
        goldenesBuch = gB;
        geschenkeSack = new String[10];
    }

    void printSack(){
        for(String str : geschenkeSack){
            System.out.println(str);
        }
        System.out.println();
    }

    void putPraesent(String praesent){
        if(geschenkeImSack > 9){
            System.out.println("Sack ist voll. Entferne zuerst Geschenke");
        } else {
            geschenkeSack[geschenkeImSack] = praesent;
            geschenkeImSack++;
        }
    }

    void putPraesente(String[] praesente){
        int u = geschenkeSack.length-geschenkeImSack;
        int p = praesente.length;
        System.out.println(u +" "+ p);
        boolean sackG = p > u;
        int counter = 0;
        if(sackG) System.out.println("Kein Platz mehr für alle Geschenke");
        else {
            for(int i = 0; i < praesente.length;i++){
                geschenkeSack[geschenkeImSack] = praesente[i];
                geschenkeImSack++;
            }
        }
    }

    String getAPraesent(){
        if(geschenkeImSack > 0){
            int lastPreasent = 0;
            for(int i = 0; i < geschenkeSack.length;i++){
                if(geschenkeSack[i] != null) lastPreasent = i;
            }
            String p = geschenkeSack[lastPreasent];
            geschenkeSack[lastPreasent] = null;
            geschenkeImSack--;
            return p;
        } else {
            return "Sorry Sack ist leer";
        }
    }
}
