static final int MAX = 1000005; 
    
    static boolean isPrime(int n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)throws java.lang.Exception {
        boolean[] p= new boolean[(int)MAX];
        int prefix[] = new int[MAX + 1]; 
        
        for (int i = 0; i < MAX; i++) { 
            p[i]=true;
            prefix[i]=0;
        }
        p[0]=false;
        p[1]=false;
        prefix[0]=0;
        int c=1;
        for (int i = 2; i < Math.sqrt(MAX); i++) { 
            if(isPrime(i)==true){
                prefix[c++]=i;
                for (int j=i*i;j<=MAX;j=j+i){
                    if(p[j]==true){
                        p[j]=false;
                    }
                }
            }
        }
        // for (int i = 1; i < MAX; i++) { 
        //     System.out.println("i="+i+" p[i]="+p[i]+" prefix[i]="+prefix[i]);
        // }

        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-- >0){
            int n=sc.nextInt();
              
            System.out.println(prefix[n]);
        }

    }