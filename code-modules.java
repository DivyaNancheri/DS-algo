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