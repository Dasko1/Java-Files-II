package files;

public class GetReturn {

    public static void main(String[] args){

        returnExplainer ret = new returnExplainer();
        System.out.println("\nThe sum calculated in returnExplainer is: " + ret.getX(ret.x, ret.y));
    }
}
