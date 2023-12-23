class path-crossing {
    public boolean isPathCrossing(String path) {
        int n = path.length();
        int x = 0;
        int y = 0;
        for(int i=0;i<n;i++)
        {
            int tempx=x;
            int tempy=y;
            for(int j=i;j<n;j++)
            {
                if(path.charAt(j)=='N')
                {
                    y++;
                }
                else if(path.charAt(j)=='S')
                {
                    y--;
                }
                else if(path.charAt(j)=='W')
                {
                    x--;
                }
                else
                {
                    x++;
                }
                if(tempx==x && tempy==y)
                {
                    return true;
                }
            }
        }
        return false;
        
        
    }
}
