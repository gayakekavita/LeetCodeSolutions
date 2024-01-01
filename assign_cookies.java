class assign_cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int index=0;
        while(index<s.length && count<g.length)
        {
            if(s[index]>=g[count])
            {
                count++;
            }
            index++;
        }
        return count;
        
    }
}
