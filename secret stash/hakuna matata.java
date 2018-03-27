public class HakunaMatata {
    public static void main(String[] args){
        
        String lyric[]={"Hakuna Matata, what a wonderful phrase...",
            "Haukna Matata, ain't no passing craze...",
            "It means no worries, for the rest of your day",
            "It's a problem free...","Philosophy.....",
            "Hakuna Matata"};
        int x = 0;
        while (x < 2){
            for(int i=0; i<lyric.length; i++){
                System.out.println(lyric[i]);
                
            }
            System.out.println();
            x++;
        }
    }
}

