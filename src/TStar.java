public class TStar {
    static String genTstar(int h, int lge){
        boolean even = lge%2 == 0;
        if(even) lge++;
        int middle = lge/2 + 1;
        for(int i = 0; i < lge; i++){
            if(i + 1 != middle){
                System.out.println(" ".repeat(h) + "*");
            } else {
                System.out.println("*".repeat(h+1));
            }
        }
        return null;
    }
}
