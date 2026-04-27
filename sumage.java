public class sumage {
    int sum(int  a){
        int  sumNum=0;
        while(a>0){
            sumNum+=(a%10);
            a/=10;
        }
      return  sumNum;
    }

}
