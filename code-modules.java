static boolean isPrime(int n){
    for (int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}

//to remove duplicates in a string IP=>aaabccddd  OP=>abcd using hashset
static String superReducedString(String s) {
    HashSet<Character> h = new HashSet<Character>(); 
    
    for(int i=0;i<s.length();i++){
        h.add(s.charAt(i)); 
    }

    
    StringBuilder sb2 = new StringBuilder(""); 

    for (Character c : h)
        sb2.append(c);

    return sb2.toString();
}