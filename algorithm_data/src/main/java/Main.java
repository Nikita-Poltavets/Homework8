public class Main {

    public void getArray(){
        int[] ints = new int[100000];
        int index = 0;
        for (int i = 0 ; i < ints.length ; i++) {
            index = (int) Math.floor(Math.random() * 100000);
            ints[i] = index;
        }
        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
    }

}
