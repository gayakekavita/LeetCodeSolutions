class Array_Formation_through_concatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        StringBuilder sb=new StringBuilder();
        for(int x:arr)
        {
            sb.append("*");
            sb.append(x);
            sb.append("*");
        }
        for(int i=0;i<pieces.length;i++)
        {
            StringBuilder s=new StringBuilder();
            for(int j=0;j<pieces[i].length;j++)
            {
                s.append("*");
                s.append(pieces[i][j]);
                s.append("*");
            }
        
        if(!sb.toString().contains(s.toString()))
        {
            return false;

        }
        }
        return true;
    }
}