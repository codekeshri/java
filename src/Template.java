import java.io.*;
import java.util.*;
import java.math.*;
public class  Template{

    static void solve() throws IOException {

    }

    public static void main(String[] args) throws Exception {

        int t = 1;
        t = in.nextInt();
        while (t != 0) {
            solve();
            t--;
        }
        out.close();
    }

    static FastReader in = new FastReader();
    static FastWriter out =new FastWriter();
    static void debug(Object... argObjects) throws IOException {
        out.println(Arrays.deepToString(argObjects));
    }

    static final int MOD = (int) (1e9 + 7);
    static final int MAXI = Integer.MAX_VALUE;
    static final int MINI = Integer.MIN_VALUE;
    static final long MAXL = Long.MAX_VALUE;
    static final long MINL = Long.MIN_VALUE;
    static final double MAXD = Double.MAX_VALUE;
    static final double MIND = Double.MIN_VALUE;
    static final float MINF = Float.MIN_VALUE;
    static final float MAXF = Float.MAX_VALUE;

    static class Pair<K,V>{
        public K key;
        public V value;

        public Pair(){}
        public Pair(K k,V v){
            key = k;
            value = v;
        }
        public String toString(){
            return "(" + key + ", " + value + ")";
        }
    }
    static class Triplet<F, S, T> {
        public F first;
        public S second;
        public T third;

        public Triplet() {
        }

        public Triplet(F f, S s, T t) {
            first = f;
            second = s;
            third = t;
        }
        public String toString() {
            return "(" + first + ", " + second + ", " + third + ")";
        }
    }


    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in),1<<16);
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            bw = new BufferedWriter(new OutputStreamWriter(System.out), 1 << 16);
        }

        // Print a single value
        public void print(String s) throws IOException {
            bw.write(s);
        }

        public void print(int x) throws IOException {
            bw.write(Integer.toString(x));
        }

        public void print(long x) throws IOException {
            bw.write(Long.toString(x));
        }

        public void print(double x) throws IOException {
            bw.write(Double.toString(x));
        }
        public void print(Object obj) throws IOException{
            bw.write(obj.toString());
        }

        // Print a value with a newline
        public void println(String s) throws IOException {
            bw.write(s);
            bw.newLine();
        }

        public void println(int x) throws IOException {
            bw.write(Integer.toString(x));
            bw.newLine();
        }

        public void println(long x) throws IOException {
            bw.write(Long.toString(x));
            bw.newLine();
        }

        public void println(double x) throws IOException {
            bw.write(Double.toString(x));
            bw.newLine();
        }
        public void println(Object obj) throws IOException {
            bw.write(obj.toString());
            bw.newLine();
        }



        // Print arrays
        public void printArray(int[] arr) throws IOException {
            for (int x : arr) {
                print(x + " ");
            }
            println("");
        }

        public void printArray(long[] arr) throws IOException {
            for (long x : arr) {
                print(x + " ");
            }
            println("");
        }

        public void printArray(double[] arr) throws IOException {
            for (double x : arr) {
                print(x + " ");
            }
            println("");
        }

        // Print collections
        public <T> void printCollection(Collection<T> col) throws IOException {
            for (T x : col) {
                print(x.toString() + " ");
            }
            println("");
        }

        // Flush the buffer
        public void flush() throws IOException {
            bw.flush();
        }

        // Close the writer
        public void close() throws IOException {
            bw.close();
        }
    }



}


