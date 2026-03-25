

public class desafio {
    public static void main(){
        System.out.println(( (int)(Math.random() * 100) % 59) +1 );
        int []array = new int[60];
        for(int i = 1; i < 60; i++){
            array[i] = i;
        }
        int a = 0;
        int k = 0;
        while(true){
            a = (int)(((Math.random() * 100) % 59)+1) ;
            for(int i = 1; i < 60; i++){
                if(array[a] == i){
                    array[i] = 0;
                    System.out.println(a);
                }
            }
            for(int i = 1; i < 60; i++){
                if(array[i] == 0){
                    k++;
                }
            }
            if (k == 59)
                break;
        }
    }

}