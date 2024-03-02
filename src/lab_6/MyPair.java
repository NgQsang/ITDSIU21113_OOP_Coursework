public class MyPair<T, U> {

    public final T Fst;
    public final U Snd;

    public MyPair(T fst, U snd) {
        this.Fst = fst;
        this.Snd = snd;
    }

    @Override
    public String toString() {
        return "(" + Fst + ", " + Snd + ")";
    }

    public MyPair<U, T> swap() {
        return new MyPair<>(Snd, Fst);
    }

    public static void main(String args[]) {     
        //b)
        MyPair<String, Integer> p1 = new MyPair<>("Anders", 13);

        //c)
        MyPair<String, Double> p2 = new MyPair<>("Phoenix", 39.7);
        
        //d) Cannot assign p1 = p2;
        
        //e)
        MyPair<String, Integer>[] grades = new MyPair[5];
        for (int i = 0; i < 5; i++) {
            grades[i] = new MyPair<>(String.valueOf((char) (i + 65)), i);
        }
        
        //f)
        for (MyPair grade : grades) {
            System.out.println(grade);
        }
        
        //g) The value is the 2nd argument of the injected MyPair<>
        MyPair<MyPair<Integer, Integer>, String> appointment
                = new MyPair<>(new MyPair<>(2, 5), "TEST");
        System.out.println(appointment.Fst.Snd);
        
        //h)
        MyPair pSwap = p1.swap();
        System.out.println(pSwap);
    }
}
