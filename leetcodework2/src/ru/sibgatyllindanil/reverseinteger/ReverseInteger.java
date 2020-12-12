package ru.sibgatyllindanil.reverseinteger;

public class ReverseInteger {
    public static void main(String[] args){
        System.out.println(reverseInt(-2147483648));
    }

    static int reverseInt(int x){
        if(x==0||x>=Integer.MAX_VALUE||x<=Integer.MIN_VALUE){
            return 0;
        }
        int result=0;
        int multiplicator=1;
        int pref = 1;
        if (x<0){
            multiplicator=-1;
            pref=-1;
        }
        while(x/multiplicator >= 10){
            multiplicator *= 10;
        }
        do{
            if(x%10!=0) {
                if (result+((long)(x % 10) * (long)multiplicator)>=Integer.MAX_VALUE||result +((long)(x % 10) * (long)multiplicator)<=Integer.MIN_VALUE) return 0;
                result += ((x % 10) * multiplicator);
            }
            x=x/10;
            multiplicator/=10;
        }while(multiplicator!=0);
        return result*pref;
    }
}
