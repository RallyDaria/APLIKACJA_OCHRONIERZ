public class Liczydlo {
    public static void main(String[] args) {
    int [] liczydlo=new int [] {2,3,7,9,8,6,3,3,3,3,5,2};
    int count=0;
    for (int cyfra: liczydlo){
        if (cyfra==3){
            count++;
        }
    }
        System.out.println(count);
    }
    }

