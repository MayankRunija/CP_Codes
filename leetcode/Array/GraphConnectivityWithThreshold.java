class Solution {
    class UF {
        int arr[], N; boolean vis[];
        UF(int n) {
            N=n+1;
            arr=new int[N]; vis=new boolean[N];
            for(int i=0; i<n; arr[i]=i++);
        }

        int paren(int v) { return arr[v]==v? v: (arr[v]=paren(arr[v])); }

        void union(int a, int b) {
            arr[paren(b)]=paren(a);
            vis[a]=vis[b]=true;
        }
        
        boolean isConnected(int a, int b) { return paren(a)==paren(b); }
    }
    public List<Boolean> areConnected(int n, int threshold, int[][] queries) {
        UF uf = new UF(n);
        for(int i=threshold+1; i<=n; ++i) {
            if(uf.vis[i]) continue;
            for(int j=i+i; j<=n; j+=i) uf.union(i, j);
        }
        List<Boolean> res=new ArrayList<>();
        for(int[] q: queries) res.add(uf.isConnected(q[0], q[1]));
        return res;
    }
}
