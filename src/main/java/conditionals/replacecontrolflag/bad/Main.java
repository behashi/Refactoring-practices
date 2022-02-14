package conditionals.replacecontrolflag.bad;

public class Main {
    void controlFlag(){
        boolean flag = true;
        for(int i = 0; i<10; i++){
            if(flag){
                //Hace algo
                if(i>5){
                    flag = false;
                }
            }
        }
    }
}
