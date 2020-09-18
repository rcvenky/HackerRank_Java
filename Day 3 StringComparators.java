
    public static String getSmallestAndLargest(String s, int k) {
        
        String current = s.substring(0,k);
        String smallest = current;
        String largest = current;
        for(int i=k;i<s.length();i++){
            current = current.substring(1,k)+s.charAt(i);
            if(smallest.compareTo(current)>0)
            smallest = current;
            if(largest.compareTo(current)<0)
            largest = current;
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

