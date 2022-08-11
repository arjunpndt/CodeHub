class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length())
            return false;
        HashMap<Character,Integer> matching = new HashMap<>();
        HashMap<Character,Integer> source = new HashMap<>();
        for(int i = 0 ; i < s1.length() ; i++) {
            matching.put(s1.charAt(i),matching.getOrDefault(s1.charAt(i),0)+1);
            source.put(s2.charAt(i),source.getOrDefault(s2.charAt(i),0)+1);
        }
        
        if(source.equals(matching))
            return true;

        for(int i = s1.length() ; i < s2.length()+1 ; i++){
            if(matching.equals(source)){
                return true;
            }

            int freq = source.get(s2.charAt(i- s1.length()));
            freq--;
            if(freq >0){
                source.put(s2.charAt(i-s1.length()),freq);
            }else{
                source.remove(s2.charAt(i-s1.length()));
            }
            if(i < s2.length())
                source.put(s2.charAt(i),source.getOrDefault(s2.charAt(i),0)+1);
        }
        return false;
    }
}