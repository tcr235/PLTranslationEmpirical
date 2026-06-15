import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

 
public class Main {
	static final long MOD1=1000000007;
	static final long MOD2=998244353;
	static long[] tenmod;
	static final long inv9=modInv(9);
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		tenmod=new long[N+1];
		tenmod[0]=1;
		for (int j = 1; j <= N; j++) {
			tenmod[j]=(tenmod[j-1]*10L)%MOD2;
		}
		S[] dat=new S[N];
		Arrays.setAll(dat, i->new S(tenmod[N-i-1],i,i));
		LazySegTree<S, F> lazySegTree=new LazySegTree<S, F>(dat, S::op, S.E,S::map,F::composite,F.I);
		for (int j = 0; j < Q; j++) {
			int l=sc.nextInt()-1;
			int r=sc.nextInt()-1;
			long D=sc.nextLong();
			lazySegTree.apply(l,r+1,new F(D,N));
			out.println(lazySegTree.allProd().sum);
		}
		out.flush();
	}
	//LazySegTree<S, F> lazySegTree=new LazySegTree<S, F>(dat, S::op, S.E,S::map,F::composite,F.I);
	//f(a*b)!=f(a)*f(b)の場合Sを集合その作用素をmergeとみなして集合の各要素に対して作用するものをfとすればf(a*b)=f(a)*f(b)となる。
	//その場合Sには必要な情報だけを持たせる（和だったらsumと要素数があれば十分）
	static class S {
	        static final S E = new S(0,Integer.MAX_VALUE/2,Integer.MIN_VALUE/2);
	        long sum;
	        int l;
	        int r;
	        public S (long sum,int l,int r) {
	            super();
	            this.sum = sum;
	            this.l=l;
	            this.r=r;
	        }
	        public static S op(S s1, S s2) {
	        	long sum=s1.sum+s2.sum;
	        	if (sum>=MOD2) {
					sum-=MOD2;
				}
	            return new S(sum,Math.min(s1.l, s2.l),Math.max(s1.r, s2.r));
	        }
	        static S map(F f,  S s) {
	        	long c=(tenmod[(f.N-s.l)]-tenmod[(f.N-s.r-1)]);
	        	if (c<0) {
					c+=MOD2;
				}
	            return new S(((f.D*c)%MOD2*inv9)%MOD2, s.l,s.r);
	        }
	    }
	static class F {
	        static final F I = new F(0,0);
	        long D;
	        int N;
	        public F (long D, int N) {
	            super();
	            this.D = D;
	            this.N= N;
	        }
	        public static F composite(F f, F g) {
	            return new F(f.D,f.N);
	        }
	    }
	static long modInv(long x) {
        return modPow(x, MOD2 - 2);
    }
	static long modPow(long x, long y) {
        long z = 1;
        while (y > 0) {
            if (y % 2 == 0) {
                x = (x * x) % MOD2;
                y /= 2;
            } else {
                z = (z * x) % MOD2;
                y--;
            }
        }
        return z;
    }
	static class LazySegTree<S, F> {
	    final int MAX;

	    final int N;
	   
